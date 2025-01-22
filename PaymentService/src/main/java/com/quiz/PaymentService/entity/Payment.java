package com.quiz.PaymentService.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection  = "Payments")
public class Payment {
	
	@Id
	private String id;
	private String PaymentName;
	public String getPaymentName() {
		return PaymentName;
	}


	public void setPaymentName(String PaymentName) {
		this.PaymentName = PaymentName;
	}


	public String getPaymentEmail() {
		return PaymentEmail;
	}


	public void setPaymentEmail(String PaymentEmail) {
		this.PaymentEmail = PaymentEmail;
	}


	private String PaymentEmail;
	
	
	// Override toString method to print Payment details
    @Override
    public String toString() {
        return "Payment{id='" + id + "', PaymentName='" + PaymentName + "', PaymentEmail='" + PaymentEmail + "'}";
    }
	

}
