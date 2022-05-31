package com.spring.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
	
	@GetMapping("/")
	public String helloWorld() {
		return "home-page";
	}
	@ResponseBody
	@GetMapping("/hi")
	public String hi() {
		return "hello";
	}
	@ResponseBody
	@GetMapping("/bye")
	public String bye() {
		return "bye-bye";
	}
	@GetMapping("/trainer")
	public String showTrainees() {
		return "trainers-dashboard";
	}
	@GetMapping("/coder")
	public String showCoding() {
		return "coder-dashboard";
	}
	@GetMapping("/accessDenied")
	public String error() {
		return "access-denied";
	}
}
