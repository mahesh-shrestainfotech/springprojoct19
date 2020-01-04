package com.mtc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtc.app.dao.IOrderDAO;
import com.mtc.app.dao.IProductDAO;
import com.mtc.app.vo.Order;
import com.mtc.app.vo.Product;

//@Service
public class OrderService {
	
	//@Autowired
	private IProductDAO productDAO;	
	
	//@Autowired
	private IOrderDAO orderDAO;
	
	public OrderService() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public OrderService(IProductDAO productDAO, IOrderDAO orderDAO) {
		super();
		this.productDAO = productDAO;
		this.orderDAO = orderDAO;
	}



//	public OrderService(IProductDAO productDAO) {
//		super();
//		this.productDAO = productDAO;
//	}


	

	public boolean processOrder(Order order) {
		
		Product product = productDAO.findById(order.getProductId());
		
		if(order.getOrderQuantity() <= product.getQuantity()) {
			
			boolean flag = productDAO.updateProduct(order.getProductId(), (product.getQuantity() - order.getOrderQuantity()));
			
			if(flag) {
				
				orderDAO.add(order);
				
				System.out.println("Order placed  successfully!");
				return true;
			}
			
		}else {
			System.err.println("Sorry! Order couldnt be processed!");
		}
		
		return false;
	}
	
	


	public void productsList() {
		List<Product> products = productDAO.findAll();
		
		for (Product product : products) {
			System.out.println(product);
		}
	}
	
	public void ordersList() {
		
		List<Order> orders = orderDAO.findAll();
		
		for (Order order : orders) {
			System.out.println(order);
		}
	}
	
	public void setProductDAO(IProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	public void setOrderDAO(IOrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

}

