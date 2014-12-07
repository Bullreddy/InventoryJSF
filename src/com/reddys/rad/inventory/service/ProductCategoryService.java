package com.reddys.rad.inventory.service;

import java.util.List;

import com.reddys.rad.inventory.db.ProductCategory;

public interface ProductCategoryService {
	
	public ProductCategory save(ProductCategory productCategory);
	
	public List<ProductCategory> fetchCategories();

	public ProductCategory fetchCategoryByID(String productCategoryID);
}
