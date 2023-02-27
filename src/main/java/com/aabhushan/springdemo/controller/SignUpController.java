package com.aabhushan.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aabhushan.springdemo.model.User;
import com.aabhushan.springdemo.repository.UserRepository;

@Controller
public class SignUpController {
	@Autowired
	private UserRepository userRepo;
@GetMapping("/signup")

public String showSignUp() {
	return "SignUpForm";
}
@PostMapping("/signup")
public String saveUser(@ModelAttribute User user,Model model) {
	user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
	userRepo.save(user);
	
	model.addAttribute("uname",user.getUsername());
	model.addAttribute("password",user.getPassword());
	model.addAttribute("fname",user.getFname());
	model.addAttribute("lname",user.getLname());
	return "LoginForm";
}
}
