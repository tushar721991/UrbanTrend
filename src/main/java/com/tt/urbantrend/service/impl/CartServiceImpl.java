package com.tt.urbantrend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tt.urbantrend.model.Cart;
import com.tt.urbantrend.model.Order;
import com.tt.urbantrend.repository.CartRepository;
import com.tt.urbantrend.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart addItemIntoCart(Cart cart, Order order) {
		cart.getItemsInCart().add(order);
		return cart;
	}

	@Override
	public Cart removeItemFromCart(Cart cart, String orderId) {
		// TODO Auto-generated method stub

		List<Order> itemsInCart = cart.getItemsInCart();
		for (Order order : itemsInCart) {
			if (order.getOrderId() == orderId) {
				itemsInCart.remove(order);
				break;
			}
		}
		return cart;
	}

	@Override
	public Cart findCartByCustomerId(long customerId) {

		return cartRepository.findCartByCustomerId(customerId);
	}

	@Override
	public Cart addOrUpdateCart(Cart cart) {
		// TODO Auto-generated method stub
		return cartRepository.save(cart);
	}

	@Override
	public void deleteCartbyId(String cartId) {
		cartRepository.deleteById(cartId);
	}

}
