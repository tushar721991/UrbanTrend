package com.tt.urbantrend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tt.urbantrend.model.Product;

public interface ProductRepository extends MongoRepository<Product, Long> {

}
