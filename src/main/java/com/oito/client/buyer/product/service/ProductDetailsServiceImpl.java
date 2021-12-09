package com.oito.client.buyer.product.service;

import org.springframework.stereotype.Service;

import com.oito.client.buyer.product.response.PdpFreeSampleResponse;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {

	@Override
	public PdpFreeSampleResponse getFreeSampleDetails(String productId, String lang) {
		System.out.println("working our API's");
		return null;
	}

}
