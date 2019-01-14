package com.bridgelabz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.model.Otp;
import com.bridgelabz.model.User;
import com.bridgelabz.service.UserService;

@RestController

public class UserController {
  

    
	@Autowired
	private UserService userService;
	 
	/*
	 * 
	 * public String welcome() { return "welcome"; }
	 */  
	   
	@RequestMapping("/")
	  public String welcome()
	  {
		return "welcome";
		  
	  }
	@PostMapping("/user")
	public ResponseEntity<?> save(@RequestBody User user) {
	
        //userService.sendOtp(otp);
		long id = userService.save(user);

		return ResponseEntity.ok().body("New User has been saved ");
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> get(@PathVariable("id") long id) {
		User user = userService.get(id);
		return ResponseEntity.ok().body(user);
	}

	@GetMapping("/userlist")
	public ResponseEntity<List<User>> list() {
		List<User> users = userService.list();
		return ResponseEntity.ok().body(users);
	}

	@PutMapping("/user/{id}")
	public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody User user) {
		userService.update(id, user);
		return ResponseEntity.ok().body("User has been updated successfully.");
	}

	@DeleteMapping("/user/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") long id) {
		userService.delete(id);
		return ResponseEntity.ok().body("User has been deleted successfully.");
	}

}
