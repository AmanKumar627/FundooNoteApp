package com.bridgelabz.util;

public class OtpGenerator {
	public static void main(String[] args) {
		System.out.println(OtpGenerator.generatEOTP());
	}
		

	static String generatEOTP() {
		// TODO Auto-generated method stub
		int randompin=(int)(Math.random()*9000+1000);
		String otp=String.valueOf(randompin);
		return otp;
		
	}
	
	
}

