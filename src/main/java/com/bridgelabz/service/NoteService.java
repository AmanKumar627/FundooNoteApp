package com.bridgelabz.service;

import java.util.List;

import com.bridgelabz.model.Note;
import com.bridgelabz.model.Otp;

public interface NoteService{
	 long save(Note  note);
	   Note get(long id);
	   List<Note> list();
	   void update(long id, Note note);
	   void delete(long id);
	    long save(Otp otp);
	    
	}


