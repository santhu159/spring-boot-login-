package com.app.login.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmployeeDetails {
@Column(name = "qua")
private String qualification;
@Column(name = "paddress")
private String presentAddress;
@Column(name = "pmaddress")
private String permenetAdress;

public EmployeeDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public EmployeeDetails(String qualification, String presentAddress, String permenetAdress) {
	super();
	this.qualification = qualification;
	this.presentAddress = presentAddress;
	this.permenetAdress = permenetAdress;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getPresentAddress() {
	return presentAddress;
}
public void setPresentAddress(String presentAddress) {
	this.presentAddress = presentAddress;
}
public String getPermenetAdress() {
	return permenetAdress;
}
public void setPermenetAdress(String permenetAdress) {
	this.permenetAdress = permenetAdress;
}
@Override
public String toString() {
	return "EmployeeDetails [qualification=" + qualification + ", presentAddress=" + presentAddress
			+ ", permenetAdress=" + permenetAdress + "]";
}

}
