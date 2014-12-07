package com.reddys.rad.inventory.dao;

import java.util.List;

import com.reddys.rad.inventory.db.ProductCategory;

public interface ProductCategoryDAO {
	
	public ProductCategory save(ProductCategory productCategory);
	
	public List<ProductCategory> fetchCategories();

	public ProductCategory fetchCategoryByID(String productCategoryID);

}
