package com.example.NewProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	@GetMapping("/")
	public String index() {
		return "welcome";
	}
	//end point for login api 
	@GetMapping("/")
	public String loginUser() {
		return "login.html";
	}

}
