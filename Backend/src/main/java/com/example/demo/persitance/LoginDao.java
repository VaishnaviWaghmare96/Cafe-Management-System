package com.example.demo.persitance;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Login;

@Service
public class LoginDao {
	
	LoginRepo lorepo;
	@Autowired
	public LoginDao(LoginRepo lorepo) {
		this.lorepo = lorepo;
	}
	
	public List<Login> getLoginUser(){
		return lorepo.findAll();	
	}
	
	public Login getUserById(int id){
	return lorepo.findById(id).get();
		
	}
	
	public void insert(Login login) {
		lorepo.save(login);
	}
	
	public void delete(int id) {
		lorepo.deleteById(id);
	}
	

}
