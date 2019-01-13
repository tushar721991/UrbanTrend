package com.tt.urbantrend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tt.urbantrend.model.Customer;
import com.tt.urbantrend.model.Customer.CustomerStatus;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	@Query("UPDATE Customer set customerStatus=?1 WHERE customerId=?2")
	public void changeCustomerStatus(CustomerStatus customerStatus, long customerId);

	@Query("FROM Customer WHERE customerId=?1 AND customerPassword=?2")
	public Customer authenticateCustomer(long customerId, String customerPassword);
	
}
