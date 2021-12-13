package com.oito.client.buyer.product.vo.mapper;

import java.util.List;
import java.util.Map;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.oito.client.buyer.product.vo.ProductVariantVO;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ProductVariantVOMapper {

	@Mapping(expression = "java((String)map.get(\"skuNumber\"))", target = "productId")
	@Mapping(expression = "java((String)map.get(\"skuName\"))", target = "name")
	@Mapping(expression = "java((String)map.get(\"image\"))", target = "imageUrl")
	@Mapping(expression = "java((Boolean)map.get(\"freeSampleEnabled\"))", target = "freeSampleEnabled")
	@Mapping(expression = "java((List<Map<String, Object>>)map.get(\"collectionAttributes\"))", target = "collectionAttributes")
	ProductVariantVO toVO(Map<String, Object> map);

	List<ProductVariantVO> toVOList(List<Map<String, Object>> variantList);

	// @Mapping(source = "response.objectId", target = "productId")
	// @Mapping(source = "response.title", target = "name")
	ProductVariantVO toVO(ProductVariantVO response);

}
