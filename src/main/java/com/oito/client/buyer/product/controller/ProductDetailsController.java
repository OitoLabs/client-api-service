package com.oito.client.buyer.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oito.client.buyer.product.response.PdpFreeSampleResponse;
import com.oito.client.buyer.product.service.ProductDetailsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("apps/v1/products")
@Api(tags = "ProductDetailsControllerV1")
public class ProductDetailsController {
	
	@Autowired
	private ProductDetailsService productDetailsService;
	
	@GetMapping("/free-sample")
	@ApiOperation(value = "Free Sample Products", code = 200, httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
	public PdpFreeSampleResponse getFreeSampleDetails(
			@PathVariable @ApiParam(name = "Product ID", value = "Example: 102240") final String productId,
			@RequestHeader(name = HttpHeaders.ACCEPT_LANGUAGE, defaultValue = "th", required = false) @ApiParam(name = "Language", allowableValues = "en,th") final String lang) {
		return productDetailsService.getFreeSampleDetails(productId, lang);
	}

}
