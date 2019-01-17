package com.bridgelabz.controller;

import java.util.List;

import javax.mail.internet.ContentType;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.model.LoginDTO;
import com.bridgelabz.model.User;
import com.bridgelabz.service.UserService;
import com.sun.mail.iap.Response;


@RestController
@RequestMapping("/userController")
public class UserController {
  
  @RequestMapping("/")
  public String welcome() {
	  return "welcome";
  }
    
	@Autowired
	private UserService userService;
	 
	/*
	 * 
	 * public String welcome() { return "welcome"; }
	 */  
	@PostMapping(value="/user",consumes= MediaType.APPLICATION_JSON_UTF8_VALUE)

	public ResponseEntity<?> save(@RequestBody User user) {
	
        //userService.sendOtp(otp);
		System.out.println(user);
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

	
	@PutMapping(value="/forgotpassword/resetpassword/{token}")@PostMapping(value="/login")
	public ResponseEntity<Response> login(@Valid @RequestBody LoginDTO loginDTO)
	{
		String token = userService.login(loginDTO);
		return new ResponseEntity<Response>(new Response(token), HttpStatus.OK);
	}
	
	
	public ResponseEntity<Response> resetPassword(@PathVariable String token,String password1,String password2)
	{
		userService.resetPassword(token, password1,password2);
		return new ResponseEntity<Response>(new Response("Password has been changed sucessfully"), HttpStatus.OK);
	
}

}
	

