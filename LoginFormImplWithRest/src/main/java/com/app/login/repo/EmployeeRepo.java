package com.app.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.login.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
