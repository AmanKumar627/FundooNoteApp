package com.bridgelabz.utility;

import com.bridgelabz.model.User;


public class Sendmail {
static User user;
	
       public static void sendmail()
       {
		
		MailVerification.send("aman.kumar627@gmail.com ", "sxxneeyeikxazsas", user.getEmail(), OtpGenerator.generatEOTP(), "hiiii");

		//MailforgotPassword.send("aman.kumar627@gmail.com","sxxneeyeikxazsas", null, null, null);
	}
}
