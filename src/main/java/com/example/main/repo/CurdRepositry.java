package com.example.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.beans.Department;


public interface CurdRepositry extends JpaRepository<Department, Long>{

}
