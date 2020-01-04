package com.mtc.app.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.mtc.app.db.DumbOracleDB;
import com.mtc.app.vo.Product;

//@Primary
//@Repository("oracleProductDAO")
public class OracleProductDAO implements IProductDAO{
	
	private Logger logger = LoggerFactory.getLogger(OracleProductDAO.class);

	//@Autowired
	private DumbOracleDB dumbOracleDB;
	
	public void setDumbOracleDB(DumbOracleDB dumbOracleDB) {
		this.dumbOracleDB = dumbOracleDB;
	}
	
	@Override
	public Product findById(int id) {
				
		logger.info("*****findById()****");
		
		List<Product> products = dumbOracleDB.getProducts();
		
		for (Product product : products) {
			if(product.getId() == id)
				return product;
		}
		
		return null;
	}

	@Override
	public boolean updateProduct(int id, int quantity) {
		
		logger.info("****updateProduct()****");
		
		List<Product> products = dumbOracleDB.getProducts();
		
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
		
		logger.info("****findAll()***");
		
		return dumbOracleDB.getProducts();
	}
	
	

}
