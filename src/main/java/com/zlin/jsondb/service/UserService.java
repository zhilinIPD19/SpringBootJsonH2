package com.zlin.jsondb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zlin.jsondb.domain.User;
import com.zlin.jsondb.repository.UserRepository;

@Service
public class UserService {
	
	 private UserRepository userRepository;
	
	
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public Iterable<User> list(){
		return userRepository.findAll();
		
	}
	
	public Iterable<User> save(List<User> users){
		return userRepository.saveAll(users);
		
	}
	

	public User save(User user){
		return userRepository.save(user);
		
	}

}
