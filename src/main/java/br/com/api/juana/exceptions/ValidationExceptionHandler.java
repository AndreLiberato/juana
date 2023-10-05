package br.com.api.juana.exceptions;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ValidationExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Map<String, String> badRequestValidationExceptionHandler(MethodArgumentNotValidException exception) {
		Map<String, String> erros = new HashMap<String, String>();
		exception.getAllErrors().forEach((erro) -> {
			erros.put(((FieldError) erro).getField(), erro.getDefaultMessage());
		});
		return erros;
	}

}
