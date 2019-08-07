package com.cg.tms.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.cg.tms.bean.TicketBean;
import com.cg.tms.bean.TicketCategory;
import com.cg.tms.exception.TicketSystemException;
import com.cg.tms.service.TicketService;
import com.cg.tms.service.TicketServiceImpl;

public class MainUI {

	private static Scanner scan = new Scanner(System.in);
	private static TicketService service = new TicketServiceImpl();

	public static void showMenu() { // Prints the menu
		System.out.println(
				"*********************Welcome to ITIMD Helpdesk*****************\n1. Raise a Ticket\n2. Exit\n\n******************************************************\nPlease enter a choice:\n");
	}

	/*
	 * Takes the details and registers the flat
	 */
	public static void raiseTicket() throws TicketSystemException {
		System.out.println("Select Ticket Category from below list:\n1.Software Installation\n2.Mailbox Creation\n3.Network Issues");

		System.out.print("Enter option : ");
		int ticketCatNum = 0;
		try {
			ticketCatNum = Integer.parseInt(scan.next().trim());// getting the ticket category from client
		} catch (NumberFormatException e) {
			throw new TicketSystemException("Please enter valid ticket category from the list. ");
		}
		TicketCategory ticketCat = null;
		switch(ticketCatNum)
		{
		case 1:
			ticketCat = service.listTicketCategory().get(0);
			break;
		case 2:
			ticketCat = service.listTicketCategory().get(1);
			break;
		case 3:
			ticketCat = service.listTicketCategory().get(2);
			break;
		default:
			throw new TicketSystemException("Please enter valid ticket category from the list. ");
		}
		System.out.print("Enter Desciption related to your issue :  ");
		String description = scan.nextLine();
		description += scan.nextLine().trim();
		System.out.print("Enter Priority(1. low 2. medium 3. high :");
		int priorityNum = 0;
		try {
			priorityNum = Integer.parseInt(scan.next().trim());// getting the ticket category from client
		} catch (NumberFormatException e) {
			throw new TicketSystemException("Please enter valid priority from the list. ");
		}
		String priority ="";
		switch(priorityNum)
		{
		case 1:
			priority = "low";
			break;
		case 2:
			priority = "medium";
			break;
		case 3:
			priority = "high";
			break;
		default:
			throw new TicketSystemException("Please enter valid priority from the list. ");
		}
		
		TicketBean ticket = new TicketBean(0, ticketCat, description, priority, "new");
		int ticketNo = service.raiseNewTicket(ticket);

		if (ticketNo != 0) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			   LocalDateTime now = LocalDateTime.now();  
			   //System.out.println(dtf.format(now)); 
			System.out.print("Ticket Number "+ ticketNo+ " logged successfully at " + dtf.format(now));
		}

	}

	/*
	 * entry point for the application
	 */
	public static void run() {
		char run = 'y';
		do {
			showMenu();
			String choice = scan.next().trim(); // getting user choice for menu
			switch (choice) {
			case "1":// Raise Ticket
				try {
					raiseTicket();
				} catch (TicketSystemException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					System.out.println("Something went wrong!");
					e.printStackTrace();
				}
				break;
			case "2":// Exit
				System.out.println("Thank You for using our service!");
				System.exit(0);
				break;
			default:
				System.out.println("Please select a valid option!");
			}
			System.out.println("\nDo you want to continue? (y/n)......");
			run = scan.next().charAt(0);
		} while (run == 'y' || run == 'Y');
		scan.close();
	}

	public static void main(String[] args) {
		run();
	}

}
