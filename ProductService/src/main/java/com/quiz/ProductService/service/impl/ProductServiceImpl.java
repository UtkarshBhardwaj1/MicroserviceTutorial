package com.quiz.ProductService.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.ProductService.entity.Product;
import com.quiz.ProductService.repository.ProductRepository;
import com.quiz.ProductService.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {


	private ProductRepository ProductRespository;
	
	public ProductServiceImpl(ProductRepository ProductRespository) {
	this.ProductRespository = ProductRespository;
}

	@Override
	public Product add(Product Product) {

		return ProductRespository.save(Product);
	}

	@Override
	public List<Product> get() {
	
		return ProductRespository.findAll();
	}

	@Override
	public Product get(String id) {

		return ProductRespository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found with id " + id));
	}

}
