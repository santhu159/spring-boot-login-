package com.app.login.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "LoginEntity")
@Table(name = "LoginEntity")
public class LoginEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long Id;	

	String uname;
	String password;
	
	public LoginEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginEntity(Long id, String uname, String password) {
		super();
		Id = id;
		this.uname = uname;
		this.password = password;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginEntity [Id=" + Id + ", uname=" + uname + ", password=" + password + "]";
	}
		
}
