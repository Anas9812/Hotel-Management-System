package newspringproject.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import newspringproject.exception.UserNotFoundException;

@RestControllerAdvice
public class ErrorController {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationException(MethodArgumentNotValidException ex) {

		Map<String, String> errors = new HashMap<String, String>();

		ex.getBindingResult().getFieldErrors().forEach((error) -> {
			errors.put(error.getField(), error.getDefaultMessage());
		});
		
		
		return errors;

	}

	@ExceptionHandler(UserNotFoundException.class)
	public Map<String, String> UserNotFound(UserNotFoundException ex){
		
		Map<String, String> err = new HashMap<String, String>();
		err.put("errors", ex.getMessage());
		
		return err;
		
		
	}
 	

}
