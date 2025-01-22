package com.quiz.PaymentService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.quiz.PaymentService.entity.Payment;

public interface PaymentRepository extends MongoRepository<Payment,String> {

}
