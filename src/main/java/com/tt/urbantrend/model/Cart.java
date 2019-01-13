package com.tt.urbantrend.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="carts")
public class Cart {

	@Id
	private String cartId;
	private long customerId;
	private List<Order> itemsInCart;
	private double totalAmount;
	private String deliveryInfo;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(String cartId, long customerId, List<Order> itemsInCart, double totalAmount, String deliveryInfo) {
		super();
		this.cartId = cartId;
		this.customerId = customerId;
		this.itemsInCart = itemsInCart;
		this.totalAmount = totalAmount;
		this.deliveryInfo = deliveryInfo;
	}
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public List<Order> getItemsInCart() {
		return itemsInCart;
	}
	public void setItemsInCart(List<Order> itemsInCart) {
		this.itemsInCart = itemsInCart;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getDeliveryInfo() {
		return deliveryInfo;
	}
	public void setDeliveryInfo(String deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}
	
	
	
	
}
