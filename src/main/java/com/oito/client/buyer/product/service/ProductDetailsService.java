package com.oito.client.buyer.product.service;

import com.oito.client.buyer.product.response.PdpFreeSampleResponse;

public interface ProductDetailsService {

	PdpFreeSampleResponse getFreeSampleDetails(String productId, String lang);

}
