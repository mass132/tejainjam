package com.cg.mra.ui;
import java.util.Scanner;
import com.cg.mra.beans.Account;
import com.cg.mra.service.MobileService;
import java.util.Scanner;
public class MainUI {
public static void main(String[] args) {
	MobileService service=new MobileService();
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("1: Account balance Enquiry option");
		System.out.println("2: Recharge amount");
		int n=sc.nextInt();
		switch(n)
		 {
		 case 1:
			 System.out.println("Enter mobile no");
			 String mno=sc.next();
			 String accountType=null;
		String customerName=null;
		long accountBalance=0;
			Account bean=new Account( accountType, accountBalance,customerName );
			
			 bean=service.getdetails(mno);

		 case 2:
			 	System.out.println("Enter mobile no to recharge");
			 	String mno1=sc.next();
			  System.out.println("Enter amount to recharge");
			  double recharge=sc.nextDouble();
			  if(recharge>0) {
			  double d=service.getrecharge(mno1,recharge);
			  System.out.println("your recharge has completed successfully" +d);
		  }
		 }		
	}
}
}