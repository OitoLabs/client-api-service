package com.oito.client.buyer.product.service;

import static com.oito.common.util.Nulls.getIfNonNull;
import static com.oito.common.util.Nulls.throwIfNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oito.client.Constants;
import com.oito.client.ErrorCode;
import com.oito.client.buyer.category.CategoryDto.VaraintDetails;
import com.oito.client.buyer.product.response.PdpFreeSampleResponse;
import com.oito.client.buyer.product.vo.ProductVariantVO;
import com.oito.client.buyer.product.vo.SectionVO;
import com.oito.client.buyer.product.vo.mapper.ProductVariantVOMapper;
import com.oito.client.buyer.proxy.BuyerServiceProxy;
import com.oito.common.exception.ApiException;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {

	@Autowired
	private ProductVariantVOMapper variantMapper;

	@Autowired
	private BuyerServiceProxy serviceProxy;

	private String staticContentHost = "abc";

	@Override
	public PdpFreeSampleResponse getFreeSampleDetails(final String productId, final String lang) {
		final var resultMap = getProductDetailsMap(productId, lang);
		throwIfNull(resultMap.get(productId), () -> new ApiException(ErrorCode.INVALID_PRODUCT_ID));
		final Map<String, Object> map = (Map<String, Object>) resultMap.get(productId);
		final var freeSampleVariants = getFreeSampleVariants(map);
		final var freeSampleVariant = (VaraintDetails) resultMap.get(Constants.FREE_SAMPLE_VARIANT);
		final var groupBy = getIfNonNull(freeSampleVariant, () -> freeSampleVariant.getTitle());
		if (groupBy == null) {
			return getMobileResponse(List.of(new SectionVO("", freeSampleVariants)), lang);
		}
		// Grouping
		final var sections = getSections(freeSampleVariants, groupBy);

		// Convert to response format
		final var sectionList = sections.entrySet().stream()
				.map(entry -> new SectionVO(entry.getKey(), entry.getValue())).collect(Collectors.toList());

		return getMobileResponse(sectionList, lang);
	}

	private Map<String, List<ProductVariantVO>> getSections(final List<ProductVariantVO> freeSampleVariants,
			final String groupBy) {
		final Map<String, List<ProductVariantVO>> sections = new HashMap<>();
		for (final var variant : freeSampleVariants) {
			final var title = (String) variant.getCollectionAttributes().stream()
					.filter(attribute -> attribute.containsKey(groupBy)).findFirst().orElseThrow().get(groupBy);
			sections.computeIfAbsent(title, l -> new ArrayList<>());
			sections.get(title).add(variant);
			variant.setImageUrl(String.join("", staticContentHost, variant.getImageUrl()));
		}
		return sections;
	}

	private PdpFreeSampleResponse getMobileResponse(final Object sectionList, final String lang) {
		// TODO Auto-generated method stub
		return null;
	}

	private List<ProductVariantVO> getFreeSampleVariants(final Map<String, Object> map) {
		final var variantList = variantMapper.toVOList(toListOfMap(map.get(Constants.VARIANTS)));
		variantList.add(variantMapper.toVO(map));
		return variantList.stream().filter(ProductVariantVO::getFreeSampleEnabled).collect(Collectors.toList());
	}

	@SuppressWarnings("unchecked")
	private List<Map<String, Object>> toListOfMap(final Object obj) {
		return (List<Map<String, Object>>) obj;
	}

	private Map<String, Object> getProductDetailsMap(final String productId, final String lang) {
		final Map<String, Object> params = new HashMap<>();
		params.put(Constants.LANG, lang);
		params.put(Constants.SKU_NUMBER, "10009059");
		params.put(Constants.ORG_IDFIER, Constants.DEFAULT_ORG_IDFIER);
		return serviceProxy.getProductDetails(params);
	}
}
