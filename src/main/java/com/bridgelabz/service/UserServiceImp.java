package com.bridgelabz.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.dao.UserDao;
import com.bridgelabz.model.User;
import com.bridgelabz.model.LoginDTO;
import com.bridgelabz.model.Otp;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Transactional
   @Override
   public long save(User user) {
      return userDao.save(user);
   }

   @Override
   public User get(long id) {
      return userDao.get(id);
   }

   @Override
   public List<User> list() {
      return userDao.list();
   }

   @Transactional
   @Override
   public void update(long id, User user) {
      userDao.update(id, user);
   }

   @Transactional
   @Override
   public void delete(long id) {
      userDao.delete(id);
   }

@Override
  public void sendOtp(Otp otp) {
	// TODO Auto-generated method stub
	 userDao.sendOtp(otp);
}

@Override
public void resetPassword(String token, String password1, String password2) {
	// TODO Auto-generated method stub
	userDao.resetPassword(token);
}

public void login() {
	// TODO Auto-generated method stub
	userDao.login();
}

@Override
public String login(LoginDTO loginDTO) {
	// TODO Auto-generated method stub
	userDao.login();
}

}
