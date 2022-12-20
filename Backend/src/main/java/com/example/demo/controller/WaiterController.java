package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Waiter;
import com.example.demo.persitance.WaiterDao;

@RestController
public class WaiterController {
	WaiterDao wadao;
	@Autowired
	public WaiterController(WaiterDao wadao) {
		this.wadao = wadao;
	}
	@RequestMapping("getAllOrders")
	public List<Waiter> getAll(){
		return wadao.getAllOrder();
	}
	@RequestMapping("getOrderById/{sno}")
	public Waiter getById(@PathVariable int sno) {
		return wadao.getOrderById(sno);
	}
	@RequestMapping("createOrder")
	public void createOrder(@RequestBody Waiter waiter) {
		wadao.insert(waiter);
	}
	@RequestMapping("updateOrder/{sno}")
	public Waiter update(@RequestBody Waiter waiter) {
		
		wadao.insert(waiter);
		return waiter;
	}
	@RequestMapping("deleteOrder/{sno}")
	public void deleteOrder(@PathVariable int sno) {
		wadao.delete(sno);
	}
	@RequestMapping("OrderByOrderId/{orderno}")
	public List<Waiter> ordersByOrderId(@PathVariable int orderno){
		return wadao.getByOrderno(orderno);
	}
	@RequestMapping("updatePayment/{orderno}")
	public void status(@RequestBody List<Waiter> waiter) {
		wadao.payment(waiter);
		
	}

}
