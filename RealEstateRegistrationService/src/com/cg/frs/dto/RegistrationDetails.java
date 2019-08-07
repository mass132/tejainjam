package com.cg.frs.dto;
public class RegistrationDetails {
	private int FlatRegistrationNumber;
	private String FT;
	private double FA;
	private double RA;
	private double DA;
	
	
	public RegistrationDetails(int flatRegistrationNumber, String fT, double fA, double rA, double dA) {
		super();
		FlatRegistrationNumber = flatRegistrationNumber;
		FT = fT;
		FA = fA;
		RA = rA;
		DA = dA;
	}

	public RegistrationDetails() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RegistrationDetails [frn=" + FlatRegistrationNumber + ", FT=" + FT + ", FA=" + FA + ", RA=" + RA
				+ ", DA=" + DA + "]";
	}

	public int getFlatRegistrationNumber() {
		return FlatRegistrationNumber;
	}

	public void setFlatRegistrationNumber(int flatRegistrationNumber) {
		FlatRegistrationNumber = flatRegistrationNumber;
	}

	public String getFT() {
		return FT;
	}

	public void setFT(String fT) {
		FT = fT;
	}

	public double getFA() {
		return FA;
	}

	public void setFA(double fA) {
		FA = fA;
	}

	public double getRA() {
		return RA;
	}

	public void setRA(double rA) {
		RA = rA;
	}

	public double getDA() {
		return DA;
	}

	public void setDA(double dA) {
		DA = dA;
	}

}
