package com.quiz.OrderService.controller;

import org.springframework.web.bind.annotation.RestController;

import com.quiz.OrderService.entity.Order;
import com.quiz.OrderService.service.OrderService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



//@FeignClient(name = "hello-service")
@RestController()
@RequestMapping("/api/orders")
public class OrderController {
	
	private OrderService OrderService;
	
	
	
	public OrderController(OrderService OrderService) {
	
		this.OrderService = OrderService;
	}
	@GetMapping("/resource")
    public ResponseEntity<String> getResource() {
        return ResponseEntity.ok("Resource from OrderService");
    }

	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello_world";
	}
	
	//create Order
	@PostMapping("/createOrder")
	public ResponseEntity<Order> create(@RequestBody Order Order) {
		if (Order == null) {
	        throw new IllegalArgumentException("Order cannot be null");
	    }
		System.out.println("Received Order: " + Order);
		Order createdOrder = OrderService.add(Order);
		return ResponseEntity.ok(createdOrder);
	}
	
	//get all Orders
	@GetMapping("/getAllOrders")
	public List<Order> get(){
		return OrderService.get();
		
	}
	
	//get Order by id
	@GetMapping("/getOrderById/{id}")
	public Order getById(@PathVariable String id) {
		return OrderService.get(id);
	}
	

}
