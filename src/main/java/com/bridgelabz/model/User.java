package com.bridgelabz.model;



import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "User")
public class User {

	public User() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long user_id;
    
	public Long getUser_id() {
		 return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	@Column(name="name")
	private String name;
    @Column(name="email")
	private String email;
    @Column(name="password")
	private long password;




    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPassword() {
		return password;
	}

	public void setPassword(long password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + user_id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}

}
