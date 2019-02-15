package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Test;

@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping("/register")
	public String register(ModelMap map) {
		map.addAttribute("test", new Test());
		return "TestRegister";
	}
	@requestMapping("/register")
	public String saveData1(ModelMap map) {
		
	}

}
