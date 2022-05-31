package com.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.details.Cart;
import com.spring.details.Order;

@Repository
@Transactional
public class OrderDaoImpl implements OrderDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void saveOrders(Cart cart) {
		Order order = new Order();
		order.setProductId(cart.getProductId());
		order.setUsername(cart.getUsername());
		order.setProductName(cart.getProductName());
		order.setProductDesc(cart.getProductDesc());
		order.setProductUrl(cart.getProductUrl());
		order.setProductPrice(cart.getProductPrice());
		this.hibernateTemplate.save(order);

	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Order> orderList(String username) {

		return (List<Order>) this.hibernateTemplate.findByNamedParam("from Order where username=:username", "username",
				username);

	}

	@Override
	public void deleteFromCart(int id) {

		Cart cart = this.hibernateTemplate.get(Cart.class, id);
		this.hibernateTemplate.delete(cart);

	}

	@Override
	public void deleteFromOrder(int id) {

		Order order = this.hibernateTemplate.get(Order.class, id);
		this.hibernateTemplate.delete(order);

	}

}
