package com.tt.urbantrend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tt.urbantrend.exception.OrderNotFoundException;
import com.tt.urbantrend.model.Order;
import com.tt.urbantrend.repository.OrderRepository;
import com.tt.urbantrend.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public Order placeNewOrder(Order order) {
		return orderRepository.save(order);
	}


	@Override
	public List<Order> findAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public Order findOrderById(String orderId) throws OrderNotFoundException {
		Optional<Order> optionalOrder = orderRepository.findById(orderId);
		if(optionalOrder.isPresent()) {
			return optionalOrder.get();
		}
		throw new OrderNotFoundException("Order not found");
	}

	@Override
	public Order changeOrderstatus(Order order) {
		return orderRepository.save(order);
	}

}
