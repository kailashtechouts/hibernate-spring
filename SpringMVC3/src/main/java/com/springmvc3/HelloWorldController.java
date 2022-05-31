package com.springmvc3;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		String message = "Hi please learn Spring MVC";
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("message", message);
//		return new ModelAndView("hello", "message", message);
		return mv;
	}
}
