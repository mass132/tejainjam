package com.capgemini.hotel.dao;

import java.util.HashMap;


import com.capgemini.hotel.bean.CustomerBean;
import com.capgemini.hotel.bean.RoomBooking;

public class CustomerBookingDao implements ICustomerBookingDao {

	int id1;
	HashMap<Integer ,CustomerBean> customerDetails=new HashMap<Integer ,CustomerBean>(); //hashmap creation of customer details
	HashMap<Integer ,RoomBooking> roomBooking=new HashMap<Integer ,RoomBooking>();        //hash map creation for rommbooking details
	public int addCustomerDetails(CustomerBean bean) {                                 //method 1 implementation
		this.id1=bean.getCustomerid();
		customerDetails.put(id1, bean);
		roomBooking.put(id1,bean.getBean());
		if(customerDetails.containsKey(id1))
		{
			return id1;
		}
		else
		return 0;
	 } 
	public RoomBooking getBookingDetails(int id12) throws IDNotFoundException{                                      //method 2 implementation
		RoomBooking bean1=(RoomBooking) roomBooking.get(id12);
		if(bean1==null)
		{
			throw new IDNotFoundException("ENTER CORRECT ID");
		}else
		{
			return bean1;
		}
		
	}

}
