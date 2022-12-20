package com.example.demo.persitance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Waiter;

@Service
public class WaiterDao {
	
	WaiterRepo warepo;
	@Autowired
	public WaiterDao(WaiterRepo warepo) {
		this.warepo = warepo;
	}

	public List<Waiter> getAllOrder() {
		return warepo.findAll();
	}
	
	public Waiter getOrderById(int sno) {
		return warepo.findById(sno).get();
	}
	
	public void insert(Waiter waiter) {
		warepo.save(waiter);
	}
	
	public void delete(int sno) {
		warepo.deleteById(sno);
	}
	
	public List<Waiter> getByOrderno(int orderno){
		System.out.println(orderno);
		return warepo.findByOrderno(orderno);
	}
	
	public void payment(List<Waiter> waiter) {
		warepo.saveAll(waiter);
	}

}
