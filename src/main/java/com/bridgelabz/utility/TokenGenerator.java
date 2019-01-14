package com.bridgelabz.utility;

public class TokenGenerator {
	public static void main(String[] args) {
		System.out.println(TokenGenerator.generatEOTP());
	}
		

	public static boolean generatEOTP() {
		// TODO Auto-generated method stub
		int randompin=(int)(Math.random()*9000000+1000);
		String otp=String.valueOf(randompin);
		return true;
		
	}
}
