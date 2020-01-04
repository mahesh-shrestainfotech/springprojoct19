package com.mtc.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mtc.app.db.MysqlDumbDB;
import com.mtc.app.vo.Product;

//@Repository
public class ProductDAO implements IProductDAO{
	
	//@Autowired
	private MysqlDumbDB mysqlDumbDB;

	@Override
	public Product findById(int id) {		
		List<Product> products = mysqlDumbDB.getProducts();
		
		for (Product product : products) {
			if(product.getId() == id)
				return product;
		}
		
		return null;
	}

	@Override
	public boolean updateProduct(int id, int quantity) {
		
		List<Product> products = mysqlDumbDB.getProducts();
		
		for (Product product : products) {
			
			if(product.getId() == id) {
				product.setQuantity(quantity);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return  mysqlDumbDB.getProducts();
	}
	
	public void setMysqlDumbDB(MysqlDumbDB mysqlDumbDB) {
		this.mysqlDumbDB = mysqlDumbDB;
	}
	

}
