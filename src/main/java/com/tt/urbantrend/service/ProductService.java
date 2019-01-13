package com.tt.urbantrend.service;

import com.tt.urbantrend.exception.ProductNotFoundException;
import com.tt.urbantrend.model.Product;

public interface ProductService {
	
	public Product addNewProduct(Product product);
	
	public Product findProductById(long productId) throws ProductNotFoundException;
	
	public Product updateProductInformation(Product product);
	
	public void deleteProductById(long productId) throws ProductNotFoundException;
	
		

}
