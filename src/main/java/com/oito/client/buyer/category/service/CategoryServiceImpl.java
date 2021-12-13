package com.oito.client.buyer.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oito.client.buyer.category.CategoryDto;
import com.oito.client.buyer.proxy.CacheServiceProxy;
import com.oito.client.buyer.proxy.BuyerServiceProxy;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private BuyerServiceProxy buyerServiceProxy;

	@Autowired
	private CacheServiceProxy cacheServiceProxy;

	@Override
	public CategoryDto getCategory(final String lang) {
		final var data = cacheServiceProxy.getCategory("72", lang);
		return data;
	}

	@Override
	public List<String> searchPopularTerms(final Long categoryId, final Integer limit, final String lang) {

		return null;// serviceProxy.searchPopularTerms(categoryId, limit, lang);

	}

	@Override
	public List<Object> loadBOQList() {
		return buyerServiceProxy.loadBOQList();
	}
}
