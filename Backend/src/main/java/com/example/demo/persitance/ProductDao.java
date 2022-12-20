package com.example.demo.persitance;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
@Service
public class ProductDao {
	@Autowired
	private ProductRepo prdrep;
	
	public List<Product> getAllProd(){
		return prdrep.findAll();//select * from product
	}
	
	public Product getProdById(int id) {
		return prdrep.findById(id).get();// select * from product where id=?;
	}
	
	public void insert(Product product) {
		//insert into product(item,image,price) 
		//values(ice-cream,assests/images/ice.jpg,50);
		prdrep.save(product);
	}
	public void delete(int id) {
		prdrep.deleteById(id);//delete * from product where id=?;
	}

}
