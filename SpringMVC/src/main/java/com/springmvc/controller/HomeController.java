package com.springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		
		model.addAttribute("name", "Kailash");
		model.addAttribute("id", 716);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Raghu");
		friends.add("Babu");
		friends.add("Ramesh");
		friends.add("Yogesh");
		model.addAttribute("f",friends);
		
		return "index";
	}
	@RequestMapping("/help")
	 public ModelAndView help() {
		 System.out.println("it is help controller");
		 //creating mav object
		 ModelAndView mav = new ModelAndView();
		 mav.addObject("name", "Chakri");
		 mav.addObject("rnumber", 531);
		 LocalDateTime now = LocalDateTime.now();
		 mav.addObject("time", now);
		 
		 //marks
		 List<Integer> list = new ArrayList<Integer>();
		 list.add(23);
		 list.add(46);
		 list.add(92);
		 list.add(184);
		 
		 mav.addObject("marks", list);
		 
		 mav.setViewName("help");
		 
		 return mav;
	 }
}