package com.bridgelabz.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.dao.NoteDao;
import com.bridgelabz.model.Note;

import com.bridgelabz.model.Otp;

@Service
@Transactional(readOnly = true)
public class NoteServiceImpl implements NoteService{
	 @Autowired
	   private NoteDao noteDao;

	   @Transactional
	   @Override
	   public long save(Note note) {
	      return noteDao.save(note);
	   }

	   @Override
	   public Note get(long id) {
	      return noteDao.get(id);
	   }

	   @Override
	   public List<Note> list() {
	      return noteDao.list();
	   }

	   @Transactional
	   @Override
	   public void update(long id, Note note) {
	      noteDao.update(id, note);
	   }

	   @Transactional
	   @Override
	   public void delete(long id) {
	      noteDao.delete(id);
	   }

	@Override
	public long save(Otp otp) {
		// TODO Auto-generated method stub
		return noteDao.save(otp);
	}

}
