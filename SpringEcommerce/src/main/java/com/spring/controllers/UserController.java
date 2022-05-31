package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.details.User;

@Controller
public class UserController {

	@RequestMapping(value = "/")
	public String indexPage() {

		return "index";
	}

	@RequestMapping(value = "/Register")
	public String ProcessRegister(@ModelAttribute User user, BindingResult result) {

		return "register";
	}
}
