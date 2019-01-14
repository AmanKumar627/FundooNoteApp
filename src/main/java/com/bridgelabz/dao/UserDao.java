package com.bridgelabz.dao;

import java.util.List;


import com.bridgelabz.model.User;
import com.bridgelabz.model.Otp;

public interface UserDao {

   long save(User user);

   User get(long id);

   List<User> list();

   void update(long id, User user);

   void delete(long id);

   void sendOtp(Otp otp);

}
