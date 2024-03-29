package com.cg.mra.beans;
public class Account {
private String accountType;
private String customerName;
private double accountBalance;
private String mno;
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalaance(double accountBalance) {
	this.accountBalance = accountBalance;
}
public Account(String mno,String accountType,double accountBalance , String customerName)
{
	super();
	this.mno=mno;
	this.accountType=accountType;
	this.customerName=customerName;
	this.accountBalance=accountBalance;
	
}
public Account(String accountType,double accountBalance , String customerName)
{
	super();
	this.accountType=accountType;
	this.customerName=customerName;
	this.accountBalance=accountBalance;
	
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return accountType+ " " + customerName + " " +accountBalance;
	}
public String getMno() {
	return mno;
}
public void setMno(String mno) {
	this.mno = mno;
}
}