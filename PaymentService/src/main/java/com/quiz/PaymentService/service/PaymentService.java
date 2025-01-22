package com.quiz.PaymentService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.quiz.PaymentService.entity.Payment;
import com.quiz.PaymentService.repository.PaymentRepository;


public interface PaymentService {
//	public String readPayment () {
//        return "John Doe";
//    }
	
//	@Autowired
//    private PaymentRepository PaymentRepository;
//    
//    public List<Payment> getPayments() {
//        return PaymentRepository.findAll();
//    }
//    
//    public Payment create(Payment Payment) {
//        return PaymentRepository.save(Payment);
//    }
//    
//    public Optional<Payment> updatePayment(Integer id, Payment Payment) {
//        if(!PaymentRepository.existsById(id)) {
//            return Optional.empty();
//        }
//        
////        Payment.setId(id);
//        
//        return Optional.of(PaymentRepository.save(Payment));
//    }
//    
//    public void deletePayment(Integer id) {
//        PaymentRepository.deleteById(id);
//    }
	
	Payment add(Payment Payment);
	
	List<Payment> get();
	
	Payment get(String id);
	

}
