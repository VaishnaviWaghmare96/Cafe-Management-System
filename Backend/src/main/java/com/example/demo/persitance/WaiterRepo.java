package com.example.demo.persitance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Waiter;
@Repository
public interface WaiterRepo extends JpaRepository<Waiter, Integer> {
	
	List<Waiter> findByOrderno(int orderno);
	
	

}
