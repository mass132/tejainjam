package com.capgemini.hotel.bean;

public class RoomBooking {
	private int bookingId;
	private int customerId;
	private int roomNo;
	private String roomType;
	//constructor using fields
	public RoomBooking(int bookingId, int customerId, int roomNo, String roomType) {
		super();
		this.bookingId = bookingId;
		this.customerId = customerId;
		this.roomNo = roomNo;
		this.roomType = roomType;
	}
	//to display
	public String toString() {
		return "\n Room No =" + roomNo	+ "\n RoomType=" + roomType + "";
	}
	//getters and setters
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

}
