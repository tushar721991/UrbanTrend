package com.tt.urbantrend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tt.urbantrend.model.Customer;
import com.tt.urbantrend.model.Customer.CustomerStatus;
import com.tt.urbantrend.repository.CustomerRepository;
import com.tt.urbantrend.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public Customer registerNewCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer authenticateCustomer(Customer customer) {
		
		return customerRepository.authenticateCustomer(customer.getCustomerId(), customer.getCustomerPassword());

	}

	@Override
	public Customer updateCustomerProfileInformation(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public void changeCustomerStatus(CustomerStatus customerStatus, long customerId) {
		customerRepository.changeCustomerStatus(customerStatus, customerId);
	}

}
