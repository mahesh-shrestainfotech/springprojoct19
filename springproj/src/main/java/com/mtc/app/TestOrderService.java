package com.mtc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mtc.app.service.OrderService;
import com.mtc.app.vo.Order;

public class TestOrderService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.mtc.app");
		
		OrderService orderService = applicationContext.getBean(OrderService.class);
		
		orderService.processOrder(new Order(999, 102, 20, "Urgent delivery"));
		
		System.out.println("List of Products : ");
		
		orderService.productsList();
		
		System.out.println();
	
		System.out.println("List of Orders : ");
		
		orderService.ordersList();

	}

}
