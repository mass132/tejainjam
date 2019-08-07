package com.capgemini.hotel.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.hotel.bean.CustomerBean;
import com.capgemini.hotel.bean.RoomBooking;

public class CustomerBookingDaoTest {
	ICustomerBookingDao dao=new CustomerBookingDao();
	RoomBooking bean1=new RoomBooking(123,10288,101, "ac");
	CustomerBean bean = new CustomerBean(10288, "aravind", "7093117585", "chennai","a@gmail.com" ,bean1);
	@Test
	 public void A()
	{
		 long a= dao.addCustomerDetails( bean);
		 System.out.println(a);
		 assertEquals(10288, a);
	}
	 public void B()
		{
			 RoomBooking a1= dao.getBookingDetails(bean.getCustomerid()) ;
			 System.out.println(a1);
			 assertEquals(bean1, a1);
		}
	
}
