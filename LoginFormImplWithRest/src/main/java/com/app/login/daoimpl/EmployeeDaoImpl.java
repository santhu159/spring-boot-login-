package com.app.login.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.login.dao.EmployeeDao;
import com.app.login.entity.Employee;
import com.app.login.repo.EmployeeRepo;

@Service
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	EmployeeRepo empRepo;
	@Override
	public void SaveEmployeeData(Employee e) {
		// TODO Auto-generated method stub
		empRepo.save(e);
	}
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
		
	}

}
