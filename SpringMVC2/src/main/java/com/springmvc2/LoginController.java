package com.springmvc2;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String viewLogin(@ModelAttribute("userForm") User user, Model model) {
		model.addAttribute("userForm", user);
		return "LoginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doLogin(@Valid @ModelAttribute("userForm") User userForm, BindingResult result,
			Map<String, Object> model) {

		if (result.hasErrors()) {
			return "LoginForm";
		}

		return "LoginSuccess";
	}
}
