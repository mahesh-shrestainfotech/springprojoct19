package com.mtc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mtc.app.service.OrderService;
import com.mtc.app.vo.Order;

public class TestOrderServiceXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		
		OrderService orderService = applicationContext.getBean(OrderService.class);
		
		orderService.processOrder(new Order(999, 2, 20, "Urgent delivery"));
		
		System.out.println("List of Products : ");
		
		orderService.productsList();
		
		System.out.println();
	
		System.out.println("List of Orders : ");
		
		orderService.ordersList();


	}

}
