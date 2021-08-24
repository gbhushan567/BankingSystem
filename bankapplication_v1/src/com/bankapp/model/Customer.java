package com.bankapp.model;

public class Customer {
	private String name;
	private String bankAccountNo;
	private String password;
	public Customer(String name, String bankAccountNo, String password) {
		this.name = name;
		this.bankAccountNo = bankAccountNo;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer() {}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", bankAccountNo=" + bankAccountNo + ", password=" + password + "]";
	}
	
}
