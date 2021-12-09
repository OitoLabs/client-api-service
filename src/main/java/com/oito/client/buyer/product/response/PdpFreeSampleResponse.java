package com.oito.client.buyer.product.response;

import java.util.List;

import com.oito.client.buyer.product.vo.SectionVO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value = "PDPFreeSampleResponseV1", description = "This represents the response for free sample products version1")
public class PdpFreeSampleResponse {

	@ApiModelProperty(notes = "Description", example = "You can select a maximum of 5 pieces and sample products will be received within 3-5 working days")
	private String description;

	@ApiModelProperty(notes = "Note", example = "* Sample products are only a part of the actual product. Cut to reflect the color, thickness and texture only")
	private String note;

	@ApiModelProperty(notes = "Maximum Limit", example = "5")
	private String maximumLimit;

	@ApiModelProperty(notes = "Sections")
	private List<SectionVO> sections;

}