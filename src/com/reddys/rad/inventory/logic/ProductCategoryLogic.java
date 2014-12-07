package com.reddys.rad.inventory.logic;

import com.reddys.rad.inventory.dao.ProductCategoryDAO;
import com.reddys.rad.inventory.dao.ProductCategoryDAOImpl;
import com.reddys.rad.inventory.db.ProductCategory;

public class ProductCategoryLogic {

	private static ProductCategoryDAO getProductCategoryDAO(){
		return new ProductCategoryDAOImpl();
	}
			
	public static ProductCategory save(ProductCategory productCategory) {
		getProductCategoryDAO().save(productCategory);
		return productCategory;
	}
}