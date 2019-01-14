package com.bridgelabz.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.model.Note;
import com.bridgelabz.service.NoteService;
import com.bridgelabz.utility.Sendmail;
import com.bridgelabz.model.Otp;

@RestController
@RequestMapping("/")
public class NoteController {

	 @Autowired
	   private NoteService noteService;
	/*
	  public String welcome() {
		  return "welcome";
	  }
	  */
	 
	   @PostMapping("/note")
	   public ResponseEntity<?> save(@RequestBody Note note) {
		   
	      long id = noteService.save(note);
	      
	      return ResponseEntity.ok().body("New User has been saved with ID:" + id);
	   }

	 
	   @GetMapping("/note/{id}")
	   public ResponseEntity<Note> get(@PathVariable("id") long id) {
	      Note note =noteService.get(id);
	      return ResponseEntity.ok().body(note);
	   }

	  
	   @GetMapping("/list")
	   public ResponseEntity<List<Note>> list() {
	      List<Note> notes = noteService.list();
	      return ResponseEntity.ok().body(notes);
	   }

	  
	   @PutMapping("/note/{id}")
	   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Note note) {
	      noteService.update(id, note);
	      return ResponseEntity.ok().body("Note has been updated successfully.");
	   }
        
	 
	   @DeleteMapping("/note/{id}")
	   public ResponseEntity<?> delete(@PathVariable("id") long id) {
	      noteService.delete(id);
	      return ResponseEntity.ok().body("Note has been deleted successfully.");
	   }
	   
	   @PostMapping("/note")
	   public ResponseEntity<?> save(@RequestBody Otp otp) {
	      noteService.save(otp);
	      return ResponseEntity.ok().body("Otp has send :" + otp);
	   }
}
