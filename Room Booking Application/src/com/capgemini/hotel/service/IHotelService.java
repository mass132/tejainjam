package com.capgemini.hotel.service;

import com.capgemini.hotel.bean.CustomerBean;
import com.capgemini.hotel.bean.RoomBooking;
import com.capgemini.hotel.dao.IDNotFoundException;

public interface IHotelService {
	public int addCustomerDetails(CustomerBean bean);
	public RoomBooking getBookingDetails(int id1) ;
	public boolean validateroom(int rno, String rtype);
	

}
