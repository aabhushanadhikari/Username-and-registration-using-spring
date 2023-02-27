package com.aabhushan.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aabhushan.springdemo.model.User;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String showLoginForm() {
		return "LoginForm";
	}
	@PostMapping("/login")
	public String doLogin(@ModelAttribute User user,@RequestParam String userType ,Model model) {
//		if(user.getUsername().equals("ram") && user.getPassword().equals("123")) {
//			model.addAttribute("uname",user.getUsername());
//			return "HomePage";
//		}
//		model.addAttribute("message","user not found!!!");
//		return "LoginForm";
		if(userType.equals("admin")) {
			return "AdminDashboard";
		}
		
		return "UserDashboard";
	}
}
