package com.example.demo.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Waiter {
	@Id@GeneratedValue
	private int sno;
	@Column(name="orderno")
	private int orderno;
	private String items;
	private int quantity;
	private String payement;
	@Column(name="tableno")
	private int tableno;
	private double price;
	
	public Waiter() {
		
	}

	public Waiter(int sno, int orderno, String items, int quantity, String payement, int tableno, double price) {
		
		this.sno = sno;
		this.orderno = orderno;
		this.items = items;
		this.quantity = quantity;
		this.payement = payement;
		this.tableno = tableno;
		this.price = price;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getorderno() {
		return orderno;
	}

	public void setorderno(int orderno) {
		this.orderno = orderno;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPayement() {
		return payement;
	}

	public void setPayement(String payement) {
		this.payement = payement;
	}

	public int getTableno() {
		return tableno;
	}

	public void setTableno(int tableno) {
		this.tableno = tableno;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Waiter [sno=" + sno + ", orderno=" + orderno + ", items=" + items + ", quantity=" + quantity
				+ ", payement=" + payement + ", tableno=" + tableno + ", price=" + price + "]";
	}

	
}
