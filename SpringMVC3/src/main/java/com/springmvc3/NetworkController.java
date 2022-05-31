package com.springmvc3;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes
public class NetworkController {
	@RequestMapping(value = "/addNetwork", method = RequestMethod.POST)  
		    public String addNetwork(@ModelAttribute("network") Network network,BindingResult result) {
		    return "redirect:network";  
		    }

	@RequestMapping("/network")
	public ModelAndView showNetworks() {
		return new ModelAndView("network", "command", new Network());
	}
}
