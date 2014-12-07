package com.reddys.rad.inventory.delegate;

import java.util.List;

import com.reddys.rad.inventory.dao.ProductCategoryDAO;
import com.reddys.rad.inventory.dao.ProductCategoryDAOImpl;
import com.reddys.rad.inventory.db.ProductCategory;
import com.reddys.rad.inventory.logic.ProductCategoryLogic;
import com.reddys.rad.inventory.service.ProductCategoryService;

public class ProductCategoryDelegate implements ProductCategoryService{

	public ProductCategory save(ProductCategory productCategory) {
		productCategory = ProductCategoryLogic.save(productCategory);
		return productCategory;
	}

	public List<ProductCategory> fetchCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductCategory fetchCategoryByID(String productCategoryID) {
		// TODO Auto-generated method stub
		return null;
	}

}
