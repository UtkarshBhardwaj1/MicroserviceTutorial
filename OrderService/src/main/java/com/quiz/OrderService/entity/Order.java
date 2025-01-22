package com.quiz.OrderService.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.sql.DataSourceDefinition;
import lombok.Data;


@Data
@Document(collection  = "Orders")
public class Order {
	
	@Id
	private String id;
	
	private String OrderName;
	private String OrderType;
	private String OrderInvoice;
//	public String getOrderName() {
//		return OrderName;
//	}
//
//
//	public void setOrderName(String OrderName) {
//		this.OrderName = OrderName;
//	}
//
//
//	public String getOrderEmail() {
//		return OrderEmail;
//	}
//
//
//	public void setOrderEmail(String OrderEmail) {
//		this.OrderEmail = OrderEmail;
//	}


	
	
	
	// Override toString method to print Order details
    @Override
    public String toString() {
        return "Order{id='" + id + "', OrderName='" + OrderName + "', OrderType='" + OrderType + "', OrderInvoice='" + OrderInvoice + "'}";
    }
	

}
