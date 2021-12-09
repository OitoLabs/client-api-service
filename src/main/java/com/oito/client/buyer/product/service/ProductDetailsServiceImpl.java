package com.oito.client.buyer.product.service;

import org.springframework.stereotype.Service;

import com.oito.client.buyer.product.response.PdpFreeSampleResponse;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {


	@Override
	public PdpFreeSampleResponse getFreeSampleDetails(final String productId, final String lang) {
		final var resultMap = getProductDetailsMap(productId, lang);
		throwIfNull(resultMap.get(Constants.SKU_NUMBER), () -> new ApiException(ErrorCode.INVALID_PRODUCT_ID));
		final var freeSampleVariants = getFreeSampleVariants(resultMap);
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
}
