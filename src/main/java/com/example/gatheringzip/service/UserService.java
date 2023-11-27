package com.example.gatheringzip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.gatheringzip.dto.SignupRequestDto;
import com.example.gatheringzip.model.User;
import com.example.gatheringzip.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public User save(SignupRequestDto requestDto) {
		requestDto.setPassword(encoder.encode(requestDto.getPassword()));
		return userRepository.save(User.builder()
				.email(requestDto.getEmail())
				.password(requestDto.getPassword())
				.name(requestDto.getName()).build());
	}
}
