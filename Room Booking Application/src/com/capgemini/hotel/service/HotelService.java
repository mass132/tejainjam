package com.capgemini.hotel.service;

import com.capgemini.hotel.bean.CustomerBean;
import com.capgemini.hotel.bean.RoomBooking;
import com.capgemini.hotel.dao.CustomerBookingDao;
import com.capgemini.hotel.dao.ICustomerBookingDao;
import com.capgemini.hotel.dao.IDNotFoundException;

public class HotelService implements IHotelService {
 
	ICustomerBookingDao dao=new CustomerBookingDao();              //indirect object creation for dao class
	public int addCustomerDetails(CustomerBean bean) {               //method 1 implementation
		int a=dao.addCustomerDetails( bean);
		return a;
	}
	public RoomBooking getBookingDetails(int id1)  throws IDNotFoundException {                //method 2 implementation
		RoomBooking d1=dao.getBookingDetails( id1);
		return d1;
	}
	
	public boolean validateroom(int rno, String rtype) {              //validation method 
		if(((rno==101)&&(rtype.equals("AC_SINGLE")))||((rno==102)&&(rtype.equals("AC_SINGLE")))||((rno==103)&&(rtype.equals("AC_DOUBLE")))||((rno==201)&&(rtype.equals("NONAC_SINGLE")))||((rno==202)&&(rtype.equals("NONAC_SINGLE")))||((rno==203)&&(rtype.equals("NONAC_DOUBLE"))))
		{
			return true;
		}else
		{
		return false;
		}
	}
	
	
	

}
