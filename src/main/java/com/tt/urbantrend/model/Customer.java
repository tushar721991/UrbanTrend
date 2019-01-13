package com.tt.urbantrend.model;

import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="customers")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long customerId;
	
	
	@Column(name="customer_password")
	private String customerPassword;
	
	@Column(name="customer_name")
	private String customerName;
	
	@ElementCollection
	private List<Adderess> customerAddress;

	@Column(name="customer_contact")
	private String customerContact;
	
	@Column(name="customer_email")
	private String customerEmail;
	
	@Transient
	private Map<String, Order> orders;
	
	@Enumerated(EnumType.STRING)
	@Column(name="customer_contact")
	private CustomerStatus customerStatus;
	
	public enum CustomerStatus {
		ACTIVE,INACTIVE
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Adderess> getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(List<Adderess> customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public Map<String, Order> getOrders() {
		return orders;
	}

	public void setOrders(Map<String, Order> orders) {
		this.orders = orders;
	}

	public CustomerStatus getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(CustomerStatus customerStatus) {
		this.customerStatus = customerStatus;
	}
	
	
}
