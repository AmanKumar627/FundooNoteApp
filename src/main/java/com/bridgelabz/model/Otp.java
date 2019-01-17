package com.bridgelabz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Otp")
public class Otp {

	
		
	
	public static boolean getOtpnumber;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "email")
	private int email;
	@Column(name = "otp")
	private long otpnumber;

	@Override
	public String toString() {
		return "Otp [id=" + id + ", email=" + email + ", otpnumber=" + otpnumber + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getOtpnumber() {
		return otpnumber;
	}

	public void setOtpnumber(long otpnumber) {
		this.otpnumber = otpnumber;
	}

	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}
}
