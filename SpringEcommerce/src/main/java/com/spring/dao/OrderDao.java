package com.spring.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.spring.details.Cart;
import com.spring.details.Order;

@Repository
public interface OrderDao {

	public void saveOrders(Cart cart);
	
	public List<Order> orderList(String username);
	
	public void deleteFromCart(int id);

	public void deleteFromOrder(int id);
	
	}
