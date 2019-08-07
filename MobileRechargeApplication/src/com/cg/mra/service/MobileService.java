package com.cg.mra.service;
import com.cg.mra.beans.Account;
import com.cg.mra.dao.MobileDao;
public class MobileService implements MobileServieI{
MobileDao dao=new MobileDao();
	public Account getdetails(String mno) {
		Account bean=dao.getdetails(mno);		
		return bean;
	}
	public double getrecharge(String mno1, double recharge) {
		// TODO Auto-generated method stub
		double d=dao.getrecharge(mno1,recharge);
		return d;
	}
}