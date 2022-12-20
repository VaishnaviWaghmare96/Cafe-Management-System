package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Login;
import com.example.demo.persitance.LoginDao;

@RestController
public class LoginController {
	@Autowired
	LoginDao lodao;
	@RequestMapping("displayUsers")//get
	public List<Login> display(){
		return lodao.getLoginUser();
	}
	@RequestMapping("dispById/{id}")//get
	public Login getUserId(@PathVariable int id) {
		return lodao.getUserById(id);
	}
	@RequestMapping("createUser")//post
	public void insertion(@RequestBody Login login) {
		lodao.insert(login);
	}
	@RequestMapping("updateUser/{id}")//put
	public void update(@RequestBody Login login) {
		lodao.insert(login);
	}
	@RequestMapping("deleteUser/{id}")//delete
	public void deletion(@PathVariable int id) {
		lodao.delete(id);
	}

}
