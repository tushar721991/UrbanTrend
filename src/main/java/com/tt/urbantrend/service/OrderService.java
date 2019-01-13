package com.tt.urbantrend.service;

import java.util.List;

import com.tt.urbantrend.exception.OrderNotFoundException;
import com.tt.urbantrend.model.Order;

public interface OrderService {

	public Order placeNewOrder(Order order);

	public List<Order> findAllOrders();

	public Order findOrderById(String orderId) throws OrderNotFoundException;
	
	public Order changeOrderstatus(Order order);

}
