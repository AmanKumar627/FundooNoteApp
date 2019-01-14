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

import com.bridgelabz.model.Note;

import com.bridgelabz.model.Otp;

@Repository
public class NoteDaoImpl implements NoteDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public long save(Note note) {
		sessionFactory.getCurrentSession().save(note);
		return note.getId();
	}

	@Override
	public Note get(long id) {
		return sessionFactory.getCurrentSession().get(Note.class, id);
	}

	@Override
	public List<Note> list() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Note> cq = cb.createQuery(Note.class);
		Root<Note> root = cq.from(Note.class);
		cq.select(root);
		Query<Note> query = session.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public void update(long id, Note note) {
		Session session = sessionFactory.getCurrentSession();
		Note user2 = session.byId(Note.class).load(id);
		user2.setName(note.getName());
		user2.setDiscription(note.getName());
		session.flush();
	}

	@Override
	public void delete(long id) {
		Session session = sessionFactory.getCurrentSession();
		Note note = session.byId(Note.class).load(id);
		session.delete(note);
	}

	@Override
	public long save(Otp otp) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(otp);

		return otp.getOtpnumber();
	}

}
