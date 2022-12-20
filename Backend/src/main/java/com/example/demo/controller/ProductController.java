package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.persitance.ProductDao;
@RestController
//@requestMapping("product")
public class ProductController {
	
	private ProductDao prdao;
	@Autowired
	public ProductController(ProductDao prdao) {
		
		this.prdao = prdao;
	}
//localhost:8080/product/getproduts
	@RequestMapping("getAllProducts")//@getmapping("/getproduts")
	public List<Product> getAllProducts(){
		return prdao.getAllProd();
	}
	
	@RequestMapping("getProduct/{id}")//getProduct/5
	public Product getProductById(@PathVariable int id) {//id=5
		return prdao.getProdById(id);
	}
	@RequestMapping("insertProduct")//post
	public void insertProduct(@RequestBody Product prod) {
		prdao.insert(prod);
	}
	@RequestMapping("updateProduct/{id}")//put putmapping im using 
	//request mapping
	public Product update(@RequestBody Product prod) {
		prdao.insert(prod);
		return prod;
	}
	@RequestMapping("deleteProduct/{id}")//delete
	public void deletion(@PathVariable int id) {
		prdao.delete(id);
	}

}
