package com.quiz.PaymentService.controller;

import org.springframework.web.bind.annotation.RestController;

import com.quiz.PaymentService.entity.Payment;
import com.quiz.PaymentService.service.PaymentService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



//@FeignClient(name = "hello-service")
@RestController()
@RequestMapping("/api/payments")
public class PaymentController {
	
	private PaymentService PaymentService;
	
	
	
	public PaymentController(PaymentService PaymentService) {
	
		this.PaymentService = PaymentService;
	}
	@GetMapping("/resource")
    public ResponseEntity<String> getResource() {
        return ResponseEntity.ok("Resource from PaymentService");
    }

	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello_world";
	}
	
	//create Payment
	@PostMapping("/createPayment")
	public ResponseEntity<Payment> create(@RequestBody Payment Payment) {
		if (Payment == null) {
	        throw new IllegalArgumentException("Payment cannot be null");
	    }
//		System.out.println("Received Payment: " + Payment);
		Payment createdPayment = PaymentService.add(Payment);
		return ResponseEntity.ok(createdPayment);
	}
	
	//get all Payments
	@GetMapping("/getAllPayments")
	public List<Payment> get(){
		return PaymentService.get();
		
	}
	
	//get Payment by id
	@GetMapping("/getPaymentById/{id}")
	public Payment getById(@PathVariable String id) {
		return PaymentService.get(id);
	}
	

}
