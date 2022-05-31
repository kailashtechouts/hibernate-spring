package com.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springjdbc.securityDao.SignUpDao;

@Controller
public class LoginController {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private SignUpDao signupdao;

	@GetMapping("/MyCustomLogin")
	public String welcome() {
		return  "login";
	}
	@GetMapping("/signup")
	public String signing(@ModelAttribute("signupdto") SignUpDTO signupdto) {
		return  "signup";
	}
	@PostMapping("/process-signup")
	public String processSigning(SignUpDTO signupdto) {
		
		//before encoding
		System.out.println(signupdto);
		
		String enocdedPassword = passwordEncoder.encode(signupdto.getPassword());
		signupdto.setPassword(enocdedPassword);
		
		//writting my saving data
		signupdao.saveUser(signupdto);
		
		return  "redirect:MyCustomLogin";
	}
}
