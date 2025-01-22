package com.quiz.ProductService.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection  = "products")
public class Product {
	
	@Id
	private String id;
	private String productName;
	public String getproductName() {
		return productName;
	}


	public void setproductName(String productName) {
		this.productName = productName;
	}


	public String getproductType() {
		return productType;
	}


	public void setproductType(String productType) {
		this.productType = productType;
	}


	private String productType;
	
	
	// Override toString method to print user details
    @Override
    public String toString() {
        return "User{id='" + id + "', productName='" + productName + "', productType='" + productType + "'}";
    }
	

}
