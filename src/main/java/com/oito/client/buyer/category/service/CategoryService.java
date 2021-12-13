package com.oito.client.buyer.category.service;

import java.util.List;

import com.oito.client.buyer.category.CategoryDto;

public interface CategoryService {

	CategoryDto getCategory(String lang);

	List<String> searchPopularTerms(Long categoryId, Integer limit, String lang);

	List<Object> loadBOQList();

}
