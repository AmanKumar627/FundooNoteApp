package com.bridgelabz.service;

import java.util.List;


import com.bridgelabz.model.User;
import com.bridgelabz.model.LoginDTO;
import com.bridgelabz.model.Otp;

public interface UserService {

   long save(User user);
   User get(long id);
   List<User> list();
   void update(long id, User user);
   void delete(long id);
    void sendOtp(Otp otp);
	void resetPassword(String token, String password1, String password2);
	public String login(LoginDTO loginDTO);
}
