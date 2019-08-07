package com.capgemini.hotel.bean;

public class CustomerBean {     
	private int customerid;
	private String name;
	private String mobileNo;
	private String address;
	private String email;
	private RoomBooking bean;
//constructor using fields
	public CustomerBean(int customerid, String name, String mobileNo, String address, String email, RoomBooking bean) 
	{
		super();
		this.customerid = customerid;
		this.name = name;
		this.mobileNo = mobileNo;
		this.address = address;
		this.email = email;
		this.bean = bean;
	}
	//getters and setters
	public RoomBooking getBean() {
		return bean;
	}
	public void setBean(RoomBooking bean) {
		this.bean = bean;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//to display
	public String toString() {
		return "\n Customer Name =" + name + "\n  Mobile Number =" + mobileNo + "\n Customer Address ="
				+ address + "\n Customer Email=" + email + "" + bean + "";
	}
	
}
