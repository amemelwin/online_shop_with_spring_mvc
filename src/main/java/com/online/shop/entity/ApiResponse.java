package com.online.shop.entity;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ApiResponse {
	private int code;
	private String status;
	private String message;
	private Object data;
	
	public ApiResponse(HttpStatus status,String message, Object data) {
		this.code = status.value() ;
		this.status = status.getReasonPhrase();
		this.message = message;
		this.data = data;
	}
	

}
