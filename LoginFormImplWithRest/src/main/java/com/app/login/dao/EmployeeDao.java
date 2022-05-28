package com.app.login.dao;

import java.util.List;

import com.app.login.entity.Employee;

public interface EmployeeDao {
void SaveEmployeeData(Employee employee);
List<Employee> findAll();
}
