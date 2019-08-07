package com.cg.dto;
public class FlatRegistrationDTO {
	private int id;
	private String Flattype;
	private double Flatarea;
	private double Rentamount;
	private double DepositAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getFlattype() {
		return Flattype;
	}

	public void setFT( String Flattype) {
		Flattype = Flattype;
	}
	public double getFlatarea() {
		return Flatarea;
	}

	public void setFA(double Flatarea) {
		Flatarea = Flatarea;
	}
	public double getRentamount() {
		return Rentamount;
	}
	public void setRA(double rA) {
		Rentamount = rA;
	}
	public double getDA() {
		return DepositAmount;
	}
	public void setDA(double dA) {
		DepositAmount = DepositAmount;
	}

}
