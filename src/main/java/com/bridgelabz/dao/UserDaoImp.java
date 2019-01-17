package com.bridgelabz.dao;

import java.util.List;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgelabz.model.User;
import com.bridgelabz.utility.Sendmail;
import com.bridgelabz.model.LoginDTO;
import com.bridgelabz.model.Otp;

@Repository
public class UserDaoImp implements UserDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(User user) {
      sessionFactory.getCurrentSession().save(user);
      
      return user.getUser_id();
   }

   @Override
   public User get(long user_id) {
      return sessionFactory.getCurrentSession().get(User.class, user_id);
   }

   @Override
   public List<User> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<User> cq = cb.createQuery(User.class);
      Root<User> root = cq.from(User.class);
      cq.select(root);
      Query<User> query = session.createQuery(cq);
      return query.getResultList();
   }

   @Override
   public void update(long id, User user) {
      Session session = sessionFactory.getCurrentSession();
      User user2 = session.byId(User.class).load(id);
      user2.setName(user.getName());
      user2.setEmail(user.getEmail());
      session.flush();
   }

   @Override
   public void delete(long id) {
      Session session = sessionFactory.getCurrentSession();
      User user = session.byId(User.class).load(id);
      session.delete(user);
   }

@Override
public void sendOtp(Otp otp) {
	// TODO Auto-generated method stub
	Sendmail.sendmail();
}

@Override
public void resetPassword(String token) {
	// TODO Auto-generated method stub
	
}

@Override
public void login() {
	// TODO Auto-generated method stub
	if(LoginDTO.getEmail.equals(sessionFactory)
	
			

}
