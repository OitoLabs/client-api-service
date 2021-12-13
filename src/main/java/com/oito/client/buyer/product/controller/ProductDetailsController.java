package com.oito.client.buyer.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oito.client.buyer.product.response.PdpFreeSampleResponse;
import com.oito.client.buyer.product.service.ProductDetailsService;

@RestController
@RequestMapping("apps/v1/products")
//@Api(tags = "ProductDetailsControllerV1")
public class ProductDetailsController {

	@Autowired
	private ProductDetailsService productDetailsService;

	@GetMapping("/free-sample")
//@ApiOperation(value = "Free Sample Products", code = 200, httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
	public PdpFreeSampleResponse getFreeSampleDetails() {
		return productDetailsService.getFreeSampleDetails("10009059", "en");
	}

}
