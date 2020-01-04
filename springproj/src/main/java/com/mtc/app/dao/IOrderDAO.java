package com.mtc.app.dao;

import java.util.List;

import com.mtc.app.vo.Order;

public interface IOrderDAO {
	
	void add(Order order);
	List<Order> findAll();

}
