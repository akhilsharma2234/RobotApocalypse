package com.robot.apocalypse.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.robot.apocalypse.model.Error;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ControllerAdvisor extends ResponseEntityExceptionHandler {

	@ExceptionHandler({ GeneralException.class })
	public ResponseEntity<Error> generalExceptionHandler(GeneralException ex, WebRequest request) {
		log.error("{} failed with FoundException", request.getDescription(false), ex);
		Error error = new Error(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(SurvivorNotFoundException.class)
	public ResponseEntity<Error> survivorNotFoundExceptionHandler(SurvivorNotFoundException ex, WebRequest request) {
		log.error("{} failed with FoundException {} ", request.getDescription(false), ex);
		Error error = new Error(HttpStatus.NOT_FOUND.value(), ex.getMessage());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
}
