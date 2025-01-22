package com.quiz.UserService.controller;

import org.springframework.web.bind.annotation.RestController;

import com.quiz.UserService.entity.User;
import com.quiz.UserService.service.UserService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



//@FeignClient(name = "hello-service")
@RestController()
@RequestMapping("/api/users")
public class UserController {
	
	private UserService userService;
	
	
	
	public UserController(UserService userService) {
	
		this.userService = userService;
	}
	@GetMapping("/resource")
    public ResponseEntity<String> getResource() {
        return ResponseEntity.ok("Resource from UserService");
    }

	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello_world";
	}
	
	//create user
	@PostMapping("/createUser")
	public ResponseEntity<User> create(@RequestBody User user) {
		if (user == null) {
	        throw new IllegalArgumentException("User cannot be null");
	    }
//		System.out.println("Received user: " + user);
		User createdUser = userService.add(user);
		return ResponseEntity.ok(createdUser);
	}
	
	//get all users
	@GetMapping("/getAllUsers")
	public List<User> get(){
		return userService.get();
		
	}
	
	//get user by id
	@GetMapping("/getUserById/{id}")
	public User getById(@PathVariable String id) {
		return userService.get(id);
	}
	

}
