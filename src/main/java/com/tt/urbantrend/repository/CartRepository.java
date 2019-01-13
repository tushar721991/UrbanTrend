package com.tt.urbantrend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tt.urbantrend.model.Cart;

public interface CartRepository extends MongoRepository<Cart, String> {

	public Cart findCartByCustomerId(long customerId);

}
