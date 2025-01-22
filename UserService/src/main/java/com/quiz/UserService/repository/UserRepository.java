package com.quiz.UserService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.quiz.UserService.entity.User;

public interface UserRepository extends MongoRepository<User,String> {

}
