package com.quiz.OrderService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.quiz.OrderService.entity.Order;

public interface OrderRepository extends MongoRepository<Order,String> {

}
