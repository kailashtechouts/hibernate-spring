package com.spring.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dao.CartDao;
import com.spring.dao.OrderDao;
import com.spring.dao.ProductDao;
import com.spring.dao.UserDao;
import com.spring.details.Authorities;
import com.spring.details.Cart;
import com.spring.details.Order;
import com.spring.details.ProductDetails;
import com.spring.details.User;

@Controller
public class Controllers {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private UserDao userdao;

	@Autowired
	private ProductDao productDao;

	@Autowired
	private CartDao cartDao;

	@Autowired
	private OrderDao orderDao;

	@PostMapping("/process-register")
	public String ProcessReg(@ModelAttribute User user, BindingResult result) {
		user.setEnabled(1);
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		Authorities authorities = new Authorities(user.getUsername(), "USER_ROLE");
		userdao.saveUser(user);
		userdao.saveAuthorities(authorities);

		return "redirect:login1";
	}

	@RequestMapping("/login1")
	public String LoginForm() {

		return "login";
	}

	@RequestMapping("/main-page")
	public String MainPage() {

		return "main-page";
	}

	@RequestMapping("/addproduct")
	public String ProductForm(@ModelAttribute ProductDetails productDetails, BindingResult result) {

		return "addproduct";
	}

	@RequestMapping("/product-form")
	public String ProductInf(@ModelAttribute ProductDetails productDetails, BindingResult result) {

		productDao.saveProduct(productDetails);

		return "redirect:main-page";

	}

	@RequestMapping("/plp/{ctg}")
	public String listProducts(@PathVariable("ctg") String productCtg, Model model) {
		List<ProductDetails> list = productDao.productList(productCtg);
		model.addAttribute("plplist", list);
		return "plp";
	}

	@RequestMapping("/pdp/{id}")
	public String ShowProduct(@PathVariable("id") int id, Model model) {

		ProductDetails pd = productDao.getProductListById(id);
		model.addAttribute("pd", pd);
		return "pdp";
	}

	@RequestMapping("/cart/{id}")
	public String addingCart(@PathVariable("id") int id, Model model, Principal principal) {

		String username = principal.getName(); // getting name using principal interface
		ProductDetails product = productDao.getProductListById(id);
		cartDao.saveCart(product, username); // save data to cart using product and name
		List<Cart> list = cartDao.cartList(username);
		model.addAttribute("cc", list);
		return "addcart";
	}

	@RequestMapping("/cart")
	public String showCart(Model model, Principal principal) {

		String username = principal.getName(); // getting name using principal interface
		List<Cart> list = cartDao.cartList(username);
		model.addAttribute("cc", list);
		return "addcart";
	}
	@RequestMapping("/removecart/{id}")
	public String deleteCart(@PathVariable("id") int id, Model model, Principal principal) {

	String username = principal.getName();
	orderDao.deleteFromCart(id);
	List<Cart> list = cartDao.cartList(username);
	model.addAttribute("cc", list);
	return "addcart";
	}
	@RequestMapping("/order/{id}")
	public String addOrders(@PathVariable("id") int id, Model model, Principal principal) {

		String username = principal.getName();
		Cart cart = cartDao.getCartByCartId(id);
		orderDao.saveOrders(cart);
		orderDao.deleteFromCart(id);
		List<Order> list = orderDao.orderList(username);
		model.addAttribute("od", list);
		return "order";
	}

	@RequestMapping("/order")
	public String showOrder(Model model, Principal principal) {

		String username = principal.getName();
		List<Order> list = orderDao.orderList(username);
		model.addAttribute("od", list);
		return "order";
	}
	@RequestMapping("/remove/{id}")
	public String deleteOrder(@PathVariable("id") int id, Model model, Principal principal) {

	String username = principal.getName();
	orderDao.deleteFromOrder(id);
	List<Order> list = orderDao.orderList(username);
	model.addAttribute("od", list);
	return "order";

	}


}
