package com.reddys.inventory.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ProductMasterController {
	
	public List getProductCategoryList(){
		ArrayList categories = new ArrayList();
		categories.add("");
		categories.add("Computers");
		categories.add("Books");
		categories.add("Mobiles");
		return categories;
	}

}
