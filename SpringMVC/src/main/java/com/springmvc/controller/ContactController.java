package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@PostMapping("/signup")
	public String showForm(@ModelAttribute("contacts") Contacts contacts, Model model) {
		model.addAttribute("contact", contacts);
		System.out.println(contacts);
		int createContact = this.contactService.createContact(contacts);
		
		
		return "view";
	}

	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public String register(@ModelAttribute Contacts contacts, Model model) {
		model.addAttribute("contact", new Contacts());
			
		
		return "registration";
	}

}
