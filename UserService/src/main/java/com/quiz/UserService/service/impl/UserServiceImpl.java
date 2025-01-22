package com.quiz.UserService.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.UserService.entity.User;
import com.quiz.UserService.repository.UserRepository;
import com.quiz.UserService.service.UserService;

@Service
public class UserServiceImpl implements UserService {


	private UserRepository userRespository;
	
	public UserServiceImpl(UserRepository userRespository) {
	this.userRespository = userRespository;
}

	@Override
	public User add(User user) {

		return userRespository.save(user);
	}

	@Override
	public List<User> get() {
	
		return userRespository.findAll();
	}

	@Override
	public User get(String id) {

		return userRespository.findById(id)
				.orElseThrow(() -> new RuntimeException("User not found with id " + id));
	}

}
