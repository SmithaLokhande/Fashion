package com.niit.FashionShoppingBackend.Dao;

import java.util.List;

import com.niit.FashionShoppingBackend.model.Order;
import com.niit.FashionShoppingBackend.model.OrderItems;

public interface OrderItemsDao {
	public boolean saveorupdate(OrderItems orderItems);
	public boolean delete(OrderItems orderItems);
	public OrderItems getOrderItems(String ordId);
	public List<OrderItems> ordlist();
	
}
