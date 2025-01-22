package com.quiz.PaymentService.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.PaymentService.entity.Payment;
import com.quiz.PaymentService.repository.PaymentRepository;
import com.quiz.PaymentService.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {


	private PaymentRepository PaymentRespository;
	
	public PaymentServiceImpl(PaymentRepository PaymentRespository) {
	this.PaymentRespository = PaymentRespository;
}

	@Override
	public Payment add(Payment Payment) {

		return PaymentRespository.save(Payment);
	}

	@Override
	public List<Payment> get() {
	
		return PaymentRespository.findAll();
	}

	@Override
	public Payment get(String id) {

		return PaymentRespository.findById(id)
				.orElseThrow(() -> new RuntimeException("Payment not found with id " + id));
	}

}
