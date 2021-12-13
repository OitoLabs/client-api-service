package com.oito.client.buyer.product.vo;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
@ApiModel(value = "ProductVariantV1")
public class ProductVariantVO {

	@ApiModelProperty(notes = "Product ID", example = "100231")
	private String productId;

	@ApiModelProperty(notes = "Name", example = "Praksshan whole sale Inch1 Copper1 Red")
	private String name;

	@ApiModelProperty(notes = "Image Url", example = "https://www.google.co.in")
	private String imageUrl;

	@ApiModelProperty(notes = "Title", example = "Pub Table")
	private String title;

	@JsonIgnore
	private Boolean freeSampleEnabled;
	@JsonIgnore
	private List<Map<String, Object>> collectionAttributes;

	public ProductVariantVO(final ProductVariantVO vo) {
		this.productId = vo.getProductId();
		this.name = vo.getName();
		this.title = vo.getTitle();
		this.imageUrl = vo.getImageUrl();
		this.freeSampleEnabled = vo.getFreeSampleEnabled();
		this.collectionAttributes = vo.getCollectionAttributes();
	}
}
