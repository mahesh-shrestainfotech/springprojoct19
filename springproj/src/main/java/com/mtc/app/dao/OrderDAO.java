package com.mtc.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mtc.app.db.MysqlDumbDB;
import com.mtc.app.vo.Order;

//@Repository
public class OrderDAO implements IOrderDAO{

	//@Autowired
	private MysqlDumbDB mysqlDumbDB;
	
	@Override
	public void add(Order order) {
		mysqlDumbDB.getOrders().add(order);
		
	}

	@Override
	public List<Order> findAll() {
		
		return mysqlDumbDB.getOrders();
	}
	
	public void setMysqlDumbDB(MysqlDumbDB mysqlDumbDB) {
		this.mysqlDumbDB = mysqlDumbDB;
	}
	

}
