package com.cg.tms.bean;

public class TicketBean {
	private int ticketNo;
	private TicketCategory ticketCategory;
	private String ticketDescription;
	private String ticketPriority;
	private String ticketStatus;
	@Override
	public String toString() {
		return "TicketBean [ticketNo=" + ticketNo + ", ticketCategory=" + ticketCategory + ", ticketDescription="
				+ ticketDescription + ", ticketPriority=" + ticketPriority + ", ticketStatus=" + ticketStatus + "]";
	}
	public TicketBean(int ticketNo, TicketCategory ticketCategory, String ticketDescription, String ticketPriority,
			String ticketStatus) {
		super();
		this.ticketNo = ticketNo;
		this.ticketCategory = ticketCategory;
		this.ticketDescription = ticketDescription;
		this.ticketPriority = ticketPriority;
		this.ticketStatus = ticketStatus;
	}
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public TicketCategory getTicketCategory() {
		return ticketCategory;
	}
	public void setTicketCategory(TicketCategory ticketCategory) {
		this.ticketCategory = ticketCategory;
	}
	public String getTicketDescription() {
		return ticketDescription;
	}
	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}
	public String getTicketPriority() {
		return ticketPriority;
	}
	public void setTicketPriority(String ticketPriority) {
		this.ticketPriority = ticketPriority;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

}
