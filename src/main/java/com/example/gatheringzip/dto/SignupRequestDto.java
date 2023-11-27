package com.example.gatheringzip.dto;

import lombok.Data;

@Data
public class SignupRequestDto {
	private String email;
	private String password;
	private String name;
}
