package com.oito.client.buyer.proxy;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.oito.client.buyer.address.vo.UserAddressVO;
import com.oito.client.buyer.category.CategoryVO;

@FeignClient(name = "buyerServiceProxy", url = "http://localhost:8788")
public interface BuyerServiceProxy {

	@GetMapping("/product-details")
	Map<String, Object> getProductDetails(@RequestBody Map<String, Object> request);

	@GetMapping("/user-address")
	List<UserAddressVO> getUserAddress();

	@GetMapping("/category")
	CategoryVO getCategory(String lang);

	@GetMapping("/boq/boq-list")
	List<Object> loadBOQList();
}
