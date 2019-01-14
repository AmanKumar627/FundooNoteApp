package com.bridgelabz.exception;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

	

	@ExceptionHandler(CustomException.class)
	public ModelAndView handleCustomException(CustomException ex) {

		ModelAndView model = new ModelAndView("error/generic_error");
		model.addObject("errCode", ex.getName());
		model.addObject("errMsg", ex.getMessage());

		return model;

	}

	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllException(Exception ex) {

		ModelAndView model = new ModelAndView("error/generic_error");
		model.addObject("errMsg", "this is Exception.class");

		return model;

	}

}
