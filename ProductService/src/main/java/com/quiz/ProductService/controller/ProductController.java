package com.quiz.ProductService.controller;

import org.springframework.web.bind.annotation.RestController;

import com.quiz.ProductService.entity.Product;
import com.quiz.ProductService.service.ProductService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



//@FeignClient(name = "hello-service")
@RestController()
@RequestMapping("/api/products")
public class ProductController {
	
	private ProductService ProductService;
	
	
	
	public ProductController(ProductService ProductService) {
	
		this.ProductService = ProductService;
	}
	@GetMapping("/resource")
    public ResponseEntity<String> getResource() {
        return ResponseEntity.ok("Resource from ProductService");
    }

	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello_world";
	}
	
	//create Product
	@PostMapping("/createProduct")
	public ResponseEntity<Product> create(@RequestBody Product Product) {
		if (Product == null) {
	        throw new IllegalArgumentException("Product cannot be null");
	    }
		System.out.println("Received Product: " + Product);
		Product createdProduct = ProductService.add(Product);
		return ResponseEntity.ok(createdProduct);
	}
	
	//get all Products
	@GetMapping("/getAllProducts")
	public List<Product> get(){
		return ProductService.get();
		
	}
	
	//get Product by id
	@GetMapping("/getProductById/{id}")
	public Product getById(@PathVariable String id) {
		return ProductService.get(id);
	}
	

}
