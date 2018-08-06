package com.perenitysoftware.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perenitysoftware.dao.UserRepository;
import com.perenitysoftware.domain.User;


@RestController
public class TestRestController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/list")
	public List<User> getUsers(){
		System.out.println(userRepository.findAll());
		return userRepository.findAll();
	}
	
	@RequestMapping("/add")
	public User addUser(@RequestBody User u) {
		return userRepository.save(u);
	}

}
