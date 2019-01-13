package com.tt.urbantrend.service.impl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tt.urbantrend.exception.ProductNotFoundException;
import com.tt.urbantrend.model.Product;
import com.tt.urbantrend.repository.ProductRepository;
import com.tt.urbantrend.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product addNewProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product findProductById(long productId) throws ProductNotFoundException {

		Optional<Product> optionalProduct = productRepository.findById(productId);
		if(optionalProduct.isPresent()) {
			return optionalProduct.get();
		}

		throw new ProductNotFoundException("Product notFound");
		
	}

	@Override
	public Product updateProductInformation(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public void deleteProductById(long productId) throws ProductNotFoundException {


		Optional<Product> optionalProduct = productRepository.findById(productId);
		if(optionalProduct.isPresent()) {
			productRepository.deleteById(productId);
		}

		throw new ProductNotFoundException("Product notFound");
				
	}

}
