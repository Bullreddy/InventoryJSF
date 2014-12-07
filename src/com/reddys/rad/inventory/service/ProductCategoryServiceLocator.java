package com.reddys.rad.inventory.service;

import com.reddys.rad.inventory.delegate.ProductCategoryDelegate;

public class ProductCategoryServiceLocator {

	public static ProductCategoryService delegateService(){
		return new ProductCategoryDelegate();
	}
	
}
