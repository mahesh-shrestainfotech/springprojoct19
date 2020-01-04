package com.mtc.app.db;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.mtc.app.vo.Order;
import com.mtc.app.vo.Product;

//@Component
public class DumbOracleDB {
	
	private List<Product> products;
	private List<Order> orders;
	
	public DumbOracleDB() {
		// TODO Auto-generated constructor stub
	}
	
	//@PostConstruct
	public void initDumbOracleDB() {
		
		products = new ArrayList<>();
		orders = new ArrayList<>();
		
		products.add(new Product(101,"iPhone",300,40,"Mobile"));
		products.add(new Product(102,"Blackberry",320,45,"Mobile"));
		products.add(new Product(103,"OnePlus",250,30,"Mobile"));
		products.add(new Product(104,"Samsung",200,50,"Mobile"));
		products.add(new Product(105,"Nokia",150,44,"Mobile"));
		
		
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public List<Order> getOrders() {
		return orders;
	}

}
