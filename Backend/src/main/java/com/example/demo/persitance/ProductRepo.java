package com.example.demo.persitance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
