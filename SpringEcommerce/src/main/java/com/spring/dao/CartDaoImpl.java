package com.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.details.Cart;
import com.spring.details.ProductDetails;

@Repository
@Transactional
public class CartDaoImpl implements CartDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public Cart getCartByCartId(int id) {
		Cart cart = this.hibernateTemplate.get(Cart.class, id);
		System.out.println(cart);
		return cart;
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Cart> cartList(String username) {

		return (List<Cart>) this.hibernateTemplate.findByNamedParam("from Cart where username=:username", "username",
				username);

	}

	@Override
	public void saveCart(ProductDetails productDetails, String username) {
		Cart cart = new Cart();
		cart.setProductId(productDetails.getId());
		cart.setUsername(username);
		cart.setProductName(productDetails.getProductName());
		cart.setProductDesc(productDetails.getProductDesc());
		cart.setProductUrl(productDetails.getProductImageUrl());
		cart.setProductPrice(productDetails.getProductPrice());
		this.hibernateTemplate.save(cart);
	}

}
