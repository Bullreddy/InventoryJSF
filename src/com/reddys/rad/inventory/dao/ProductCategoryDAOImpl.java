package com.reddys.rad.inventory.dao;

import java.util.List;

import com.reddys.rad.inventory.dao.ProductCategoryDAO;
import com.reddys.rad.inventory.db.ProductCategory;
import com.reddys.rad.inventory.utils.EntityManager;
import com.reddys.rad.inventory.utils.HibernateEntityManagerImpl;
import com.reddys.rad.inventory.utils.JPAEntityManagerImpl;

public class ProductCategoryDAOImpl implements ProductCategoryDAO {
	
	private EntityManager getEntityManager(){
		return new HibernateEntityManagerImpl();
	}
	
	public ProductCategory save(ProductCategory productCategory) {
		getEntityManager().persist(productCategory);
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
