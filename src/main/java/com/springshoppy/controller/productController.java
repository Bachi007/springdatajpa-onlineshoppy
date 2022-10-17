package com.springshoppy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springshoppy.model.product;
import com.springshoppy.service.productService;

@RestController
public class productController {

	@Autowired
	private productService service;
	//getting all products from DB
	@RequestMapping(method=RequestMethod.GET, value="/products")
	public List<product> getAllProducts(){
		return service.getAllProducts();
	}
	//adding new product to DB
	@RequestMapping(method=RequestMethod.POST, value="/products")
	public String addProduct(@RequestBody product p1){
		return service.addProduct(p1);
	}
	//getting specific product from DB
	@RequestMapping(method=RequestMethod.GET, value="/product/{id}")
	public Optional<product> getProduct(@PathVariable int id) {
		return service.getProduct(id);
	}
	//delete product from DB
	@RequestMapping(method=RequestMethod.DELETE, value="/product/{id}")
	public String deleteProduct(@PathVariable int id) {
		
		return service.deleteProduct(id);
		
	}
	
	
}
