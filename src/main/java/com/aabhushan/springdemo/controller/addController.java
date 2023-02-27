package com.aabhushan.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class addController {
@GetMapping("/add")
public String add() {
	return "add";
}
@PostMapping("/add")
public String result(@RequestParam("firstNumber") int a, @RequestParam("secondNumber") int b,Model model) {
	
	int s=a+b;
	model.addAttribute("Sum",s);
	
	return "result";
}


}
