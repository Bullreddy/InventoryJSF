package com.reddys.inventory.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.reddys.rad.inventory.db.ProductCategory;
import com.reddys.rad.inventory.service.ProductCategoryService;
import com.reddys.rad.inventory.service.ProductCategoryServiceLocator;

@ManagedBean(name="productCategory")
public class ProductCategoryController {
	
	private String productCategoryID;
	
	private String productCategoryDescription;
	
	private String status;
	
	public List<ProductCategory> getProductCategories(){
		
		return null;
	}

	public void save(){
		System.out.println("save method");
		ProductCategory productCategory = new ProductCategory();
		populateProductCategoryBean(productCategory);
		getProductCategoryService().save(productCategory);
	}
	
	private ProductCategoryService getProductCategoryService(){
		ProductCategoryService service = ProductCategoryServiceLocator.delegateService();
		return service;
	}
	
	private void populateProductCategoryBean(ProductCategory productCategory) {
		//productCategory.setProductCategoryId(Integer.valueOf(productCategoryID));
		productCategory.setProductCategoryDescription(productCategoryDescription);
		productCategory.setStatus(status);
		
	}

	public String getProductCategoryID() {
		return productCategoryID;
	}

	public void setProductCategoryID(String productCategoryID) {
		this.productCategoryID = productCategoryID;
	}

	public String getProductCategoryDescription() {
		return productCategoryDescription;
	}

	public void setProductCategoryDescription(String productCategoryDescription) {
		this.productCategoryDescription = productCategoryDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
