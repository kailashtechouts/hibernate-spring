package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.details.Cart;
import com.spring.details.ProductDetails;

@Repository
public interface CartDao {

	public Cart getCartByCartId(int id);

	public List<Cart> cartList(String username);

	public void saveCart(ProductDetails productDetails, String username);
	

}
