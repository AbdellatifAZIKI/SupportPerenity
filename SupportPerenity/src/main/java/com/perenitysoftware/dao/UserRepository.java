package com.perenitysoftware.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perenitysoftware.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUserName(String username);
}
