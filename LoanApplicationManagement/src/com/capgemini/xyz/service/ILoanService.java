package com.capgemini.xyz.service;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;

public interface ILoanService {
	public long insertCust(Customer bean);
	public double calculateEMI(double loanAmount, int duration);
	public Loan applyLoan(Loan l);
}
