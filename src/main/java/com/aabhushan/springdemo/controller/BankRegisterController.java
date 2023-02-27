package com.aabhushan.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aabhushan.springdemo.model.BankUser;

@Controller
public class BankRegisterController {
@GetMapping("/bankregisterform")
	public String showBankRegisterForm() {
		return "BankRegistrationForm";
	}
@PostMapping("/bankregisterform")	
	public String postBankRegisterForm(@ModelAttribute BankUser bankuser, Model model) {
	model.addAttribute("username",bankuser.getUserName());
	model.addAttribute("account",bankuser.getAccount());
	model.addAttribute("fname",bankuser.getFirst());
	model.addAttribute("lname",bankuser.getLast());
	model.addAttribute("date",bankuser.getDate());
	return "BankProfile";
	
}
	
}
