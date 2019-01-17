package com.bridgelabz.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class LoginDTO {
	public static Object getEmail;

	@Email(message = "Enter valid Email")
	@NotEmpty(message="Email must not be Empty")
	private String email;
	
	@NotBlank(message = "Password must not be blank")
	@Size(min=4,max=100,message="Enter Strong Password")
	private String password;

	@Override
	public String toString() 
	{
		return "UserDTO [email=" + email + ", password=" + password + "]";
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
