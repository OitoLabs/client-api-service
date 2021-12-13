package com.oito.client.buyer.product.vo;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@ApiModel(value = "ProductSectionV1")
public class SectionVO {

	@ApiModelProperty(notes = "Title", example = "Inch1")
	private String title;

	@ApiModelProperty(notes = "Items")
	private List<ProductVariantVO> items;

}
