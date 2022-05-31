package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.spring.details.ProductDetails;

@Repository
public interface ProductDao {

	public void saveProduct(ProductDetails productDetails);

	public List<ProductDetails> productList(String productCtg);

	public ProductDetails getProductListById(int id);
}
