package com.quiz.OrderService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.quiz.OrderService.entity.Order;
import com.quiz.OrderService.repository.OrderRepository;


public interface OrderService {
//	public String readOrder () {
//        return "John Doe";
//    }
	
//	@Autowired
//    private OrderRepository OrderRepository;
//    
//    public List<Order> getOrders() {
//        return OrderRepository.findAll();
//    }
//    
//    public Order create(Order Order) {
//        return OrderRepository.save(Order);
//    }
//    
//    public Optional<Order> updateOrder(Integer id, Order Order) {
//        if(!OrderRepository.existsById(id)) {
//            return Optional.empty();
//        }
//        
////        Order.setId(id);
//        
//        return Optional.of(OrderRepository.save(Order));
//    }
//    
//    public void deleteOrder(Integer id) {
//        OrderRepository.deleteById(id);
//    }
	
	Order add(Order Order);
	
	List<Order> get();
	
	Order get(String id);
	

}
