           package com.spring.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstPageController {
		@RequestMapping("/first")
		public ModelAndView firstView() {
			String message = "Hi please login";
			ModelAndView mv = new ModelAndView();
			mv.setViewName("first");
			mv.addObject("message", message);
			return mv;
		}
}
