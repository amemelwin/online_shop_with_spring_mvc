package com.online.shop.entity;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import lombok.Data;

@Data
public class ApiErrResponse {
	
	private int code;
	private String status;
	private String message;
	private Map<String,String> errors;
	
	public ApiErrResponse(HttpStatus status,String message, Map<String,String> errors) {
		this.code = status.value() ;
		this.status = status.getReasonPhrase();
		this.message = message;
		this.errors = errors;
	}
	
	public ResponseEntity<Object> response(){
		return new ResponseEntity(this,HttpStatus.valueOf(code));
	}

}
