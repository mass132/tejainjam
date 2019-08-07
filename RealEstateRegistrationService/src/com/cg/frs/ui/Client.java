package com.cg.frs.ui;
import java.util.Scanner;
import com.cg.frs.dto.RegistrationDetails;
import com.cg.frs.service.FlatRegistrationServiceImpl;
import com.cg.frs.service.IFlatRegistrationService;

public class Client {
	private static Scanner sc = new Scanner(System.in);
	private static IFlatRegistrationService ser = new FlatRegistrationServiceImpl();

	public static void main(String[] args) {
		int n, ch;
		RegistrationDetails a = new RegistrationDetails();
		do {
			System.out.println("1.Registration Details \n 2.Display Flat Registration Details");
			int p = sc.nextInt();
			switch (p) {
			case 1:
				do {
					System.out.println("Existing owner id's are :- [1,2,3]");
					System.out.println("Please enter your owner id from above list");
					n = sc.nextInt();
				} while (n >= 3);
				System.out.println("Select Flat type(1-1BHK,2-2BHK)");
				a.setFT(sc.next());
				System.out.println("Enter flat Area in sq.ft:");
				a.setFA(sc.nextDouble());
				System.out.println("Enter desired rent amount Rs : ");
				a.setRA(sc.nextDouble());
				System.out.println("Enter desired deposit amount rs:");
				a.setDA(sc.nextDouble());
				a.setFlatRegistrationNumber(((int) ((Math.random() * ((9999 - 1000) + 1)) + 1000)));
				ser.registerFlat(a);
				break;
			case 2:
				System.out.println(ser.getAllOwnerIds());
				break;
			case 3:
				System.exit(0);
				break;
			default:
			}
			System.out.println("want to continue press 1");
			ch = sc.nextInt();
		} while (ch == 1);
	}
}
