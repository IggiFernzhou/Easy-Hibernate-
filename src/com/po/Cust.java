package com.po;

public class Cust {
	private String custname;
	private int age;
	private String address;
	private String password;
	public Cust() {
		
	}
	public Cust(String custname, int age, String address, String password) {
		super();
		this.custname = custname;
		this.age = age;
		this.address = address;
		this.password = password;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Cust [custname=" + custname + ", age=" + age + ", address=" + address + ", password=" + password + "]";
	}
}
