package com.oito.client.buyer.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oito.client.buyer.category.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/boq-list")
	public List<Object> getBOQList() {
		return categoryService.loadBOQList();
	}

}
