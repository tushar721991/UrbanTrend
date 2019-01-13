package com.tt.urbantrend.service;

import com.tt.urbantrend.model.Cart;
import com.tt.urbantrend.model.Order;

public interface CartService {

	public Cart addItemIntoCart(Cart cart, Order order);
	public Cart removeItemFromCart(Cart cart, String orderId);
	public Cart findCartByCustomerId(long customerId);
	public Cart addOrUpdateCart(Cart cart);
	public void deleteCartbyId(String cartId);
	
}
