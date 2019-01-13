package com.tt.urbantrend.service;

import com.tt.urbantrend.model.Customer;
import com.tt.urbantrend.model.Customer.CustomerStatus;

public interface CustomerService {

	public Customer registerNewCustomer(Customer customer);

	public Customer authenticateCustomer(Customer customer);

	public Customer updateCustomerProfileInformation(Customer customer);

	public void changeCustomerStatus(CustomerStatus customerStatus, long customerId);
	
}
