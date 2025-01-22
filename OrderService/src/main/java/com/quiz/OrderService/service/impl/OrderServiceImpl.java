package com.quiz.OrderService.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.OrderService.entity.Order;
import com.quiz.OrderService.repository.OrderRepository;
import com.quiz.OrderService.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {


	private OrderRepository OrderRespository;
	
	public OrderServiceImpl(OrderRepository OrderRespository) {
	this.OrderRespository = OrderRespository;
}

	@Override
	public Order add(Order Order) {

		return OrderRespository.save(Order);
	}

	@Override
	public List<Order> get() {
	
		return OrderRespository.findAll();
	}

	@Override
	public Order get(String id) {

		return OrderRespository.findById(id)
				.orElseThrow(() -> new RuntimeException("Order not found with id " + id));
	}

}
