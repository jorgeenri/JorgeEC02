package com.idat.idatapirest.demo.dto;

public class UserResponseDTO {
private String token;

	
	public UserResponseDTO(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
