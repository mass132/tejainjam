package com.capgemini.hotel.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.hotel.bean.CustomerBean;
import com.capgemini.hotel.bean.RoomBooking;
import com.capgemini.hotel.dao.IDNotFoundException;
import com.capgemini.hotel.service.HotelService;
import com.capgemini.hotel.service.IHotelService;

public class Client {
	IHotelService service = new HotelService(); // Indirect Object Creation for Service class
	CustomerBean bean;
	String rtype;
	int rno,a1,custId,id1;
	boolean b23 = true, c1,b12;

	void choice() {
		Scanner sc = new Scanner(System.in); // calling Scanner class
		while (b23) {
			// providing options
			System.out.println("\n HOTEL ROOM BOOKING ");
			System.out.println("\n 1.BOOK ROOM");
			System.out.println("\n 2.VIEW BOOKING DETAILS");
			System.out.println("\n 3.EXIT");
			String ch = sc.next();
			// calling switch
			switch (ch) {
			case "1":
				System.out.println("Ente Customer name"); // entering details dynamically
				String name = sc.next();
				System.out.println("Enter Email");
				String email = sc.next();
				System.out.println("Enter customer address");
				String addr = sc.next();
				System.out.println("Enter Mobile Number");
				String numb = sc.next();
				try {
					System.out.println("Room no");
					rno = sc.nextInt();
				} catch (InputMismatchException aw) {
					System.out.println("enter correct details");
				}
				System.out.println("Room Type");
				rtype = sc.nextLine() + sc.next();
				c1 = service.validateroom(rno, rtype);
				while (true) { // for validating room no and room type
					if (c1) {
						break;
					} else {
						System.out.println("enter correct room no and roomtype ");
						try {
							System.out.println("Room no");
							rno = sc.nextInt();
						} catch (InputMismatchException aq) {
							System.out.println("enter correct data");
						}
						System.out.println("Room Type");
						rtype = sc.nextLine() + sc.next();
						c1 = service.validateroom(rno, rtype);

					}
				}
	
				custId = (int) (Math.random() * 12345);
				int bId = (int) (Math.random() * 1234);
				RoomBooking bean1 = new RoomBooking(bId, custId, rno, rtype);
				bean = new CustomerBean(custId, name, numb, addr, email, bean1);
				try {                                                  // exception for id not found
				a1 = service.addCustomerDetails(bean);
				} catch (IDNotFoundException exception) {
					System.out.println(exception.getMessage());
				}
				System.out.println("\n Your Room has been successfully booked,your Customer ID is : <" + a1 + ">");
				System.out.println(bean); // displaying required output
				break;
			case "2": // option 2 calling
				try {
				System.out.println("\n Enter Customer Id"); // entering input dynamically
				id1 = sc.nextInt();
				}catch(InputMismatchException ae1)
				{
					System.out.println("enter correct input");
					
				}
				
				
					RoomBooking b1 = service.getBookingDetails(id1);
					if (b1 == null) {
						System.out.println("enter correct input");

					} else {
						System.out.println("customer name " + bean.getName() + b1);  // displaying output
						break;
					}
				
				
				
			case "3":
				System.out.println("Thank You"); // exit statement
				b23 = false;
				break;
			}
		}
	}

	public static void main(String[] args) { // main method
		Client ui = new Client(); // object creation for ui class
		ui.choice();
	}

}
