package com.example.demo.persitance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Login;
@Repository
public interface LoginRepo extends JpaRepository<Login, Integer> {

}
