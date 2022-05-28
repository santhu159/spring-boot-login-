package com.app.login.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*Component Mapping*/

@Entity
@Table(name = "emptab")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "empid")
	private Integer id;
	@Column(name = "empname")
	private String name;
	
	@Embedded
	@AttributeOverrides({ 
		@AttributeOverride(name = "qua", column = @Column(name = "qua")),
		@AttributeOverride(name = "paddress", column = @Column(name = "paddress")),
		@AttributeOverride(name = "pmaddress", column = @Column(name = "pmaddress")), })
	private EmployeeDetails empDetails;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, EmployeeDetails empDetails) {
		super();
		this.id = id;
		this.name = name;
		this.empDetails = empDetails;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeDetails getEmpDetails() {
		return empDetails;
	}

	public void setEmpDetails(EmployeeDetails empDetails) {
		this.empDetails = empDetails;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", empDetails=" + empDetails + "]";
	}
	
}
