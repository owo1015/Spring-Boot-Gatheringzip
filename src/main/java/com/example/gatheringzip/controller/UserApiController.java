package com.example.gatheringzip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.gatheringzip.dto.SignupRequestDto;
import com.example.gatheringzip.service.UserService;

@Controller
public class UserApiController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/auth/signupProc")
	public String signup(SignupRequestDto requestDto) {
		userService.save(requestDto);
		return "redirect:/login";
	}
}
