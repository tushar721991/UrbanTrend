package com.tt.urbantrend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tt.urbantrend.model.Order;
import com.tt.urbantrend.model.Order.OrderStatus;

public interface OrderRepository extends MongoRepository<Order, String> {

}
