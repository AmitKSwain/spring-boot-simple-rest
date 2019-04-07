package com.practice.springboot.rest.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springboot.rest.simple.model.User;

@RestController
public class UerController {

	@GetMapping("/")
	public String helthCheck(){
		return "OK";
	}
	
	//pass parameters using query params
	@GetMapping("/greet")
	public String greet(@RequestParam("name") String name){
		return "Hello "+name;
	}
	
	//pass parameters using path variable
	@GetMapping("/bye/{name}")
	public String sayBye(@PathVariable("name") String name){
		return "Bye "+name;
	}
	
	//inpost using request body
	@PostMapping("/register")
	public String registerUser(@RequestBody User user){
		return "User :"+user.getName()+" is registered .";
	}
}
