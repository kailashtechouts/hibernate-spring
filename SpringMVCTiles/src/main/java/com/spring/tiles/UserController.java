package com.spring.tiles;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes
public class UserController {
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user, BindingResult result) {
		return "redirect:user";
	}

	@RequestMapping("/user")
	public String showNetworks(Model model) {
		model.addAttribute("user", new User());
		return "user";
	}

	@RequestMapping("/viewing")
	public String showUsers(@ModelAttribute("user") User user, Map<String, Object> model) {

		System.out.println("username: " + user.getName());
		System.out.println("email: " + user.getEmail());
		System.out.println("password: " + user.getPassword());

		return "viewing";

	}
}
