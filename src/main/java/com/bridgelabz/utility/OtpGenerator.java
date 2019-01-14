package com.bridgelabz.utility;

public class OtpGenerator {

	static String generatEOTP() {
		// TODO Auto-generated method stub
		int randompin=(int)(Math.random()*9000+1000);
		String otp=String.valueOf(randompin);
		return otp;
		
	}
	
	
}

