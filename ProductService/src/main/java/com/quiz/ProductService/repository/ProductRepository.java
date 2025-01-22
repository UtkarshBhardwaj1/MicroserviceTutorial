package com.quiz.ProductService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.quiz.ProductService.entity.Product;


public interface ProductRepository extends MongoRepository<Product,String> {

}
