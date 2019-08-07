package com.junit;
import com.cg.mra.beans.Account;
import com.cg.mra.dao.MobileDao;
public class testReachgeaccount {
	MobileDao dao=new MobileDao();
 @Test
 public void testRechargeAccount_1() {
	 String mno="9967342342";
	 Account accountBefore =dao.getdetails(mno);
	 System.out.println("account="+accountBefore.getAccountBalance());
	 int result=(int) dao.getrecharge(mno, 15);
	 dao.getrecharge(mno, result);
 }
 @Test
 public void testRechargeAccount_2() {
	 String mno="9967342342";
	 int result=(int) dao.getrecharge(mno, 15);
int expectedResult=515;
 }
}
