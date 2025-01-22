package com.quiz.ProductService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.quiz.ProductService.entity.Product;
import com.quiz.ProductService.repository.ProductRepository;


public interface ProductService {
//	public String readproduct () {
//        return "John Doe";
//    }
	
//	@Autowired
//    private productRepository productRepository;
//    
//    public List<product> getproducts() {
//        return productRepository.findAll();
//    }
//    
//    public product create(product product) {
//        return productRepository.save(product);
//    }
//    
//    public Optional<product> updateproduct(Integer id, product product) {
//        if(!productRepository.existsById(id)) {
//            return Optional.empty();
//        }
//        
////        product.setId(id);
//        
//        return Optional.of(productRepository.save(product));
//    }
//    
//    public void deleteproduct(Integer id) {
//        productRepository.deleteById(id);
//    }
	
	Product add(Product product);
	
	List<Product> get();
	
	Product get(String id);
	

}
