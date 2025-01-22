package com.quiz.UserService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.quiz.UserService.entity.User;
import com.quiz.UserService.repository.UserRepository;


public interface UserService {
//	public String readUser () {
//        return "John Doe";
//    }
	
//	@Autowired
//    private UserRepository userRepository;
//    
//    public List<User> getUsers() {
//        return userRepository.findAll();
//    }
//    
//    public User create(User User) {
//        return userRepository.save(User);
//    }
//    
//    public Optional<User> updateUser(Integer id, User User) {
//        if(!userRepository.existsById(id)) {
//            return Optional.empty();
//        }
//        
////        User.setId(id);
//        
//        return Optional.of(userRepository.save(User));
//    }
//    
//    public void deleteUser(Integer id) {
//        userRepository.deleteById(id);
//    }
	
	User add(User user);
	
	List<User> get();
	
	User get(String id);
	

}
