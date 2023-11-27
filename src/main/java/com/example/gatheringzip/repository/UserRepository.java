package com.example.gatheringzip.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gatheringzip.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	// SELECT * FROM user WHERE email=?;
	Optional<User> findByEmail(String email);
}