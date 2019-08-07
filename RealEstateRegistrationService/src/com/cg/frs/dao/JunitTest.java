package com.cg.frs.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.frs.dto.RegistrationDetails;
public class JunitTest {
	IFlatRegistrationDAO dao = new FlatRegistrationDAOImpl();
	RegistrationDetails bean1=new RegistrationDetails(123,"KBH",200,100,500);
	@Test
	 public void A()
	{
		 int a= dao.registerDTO( bean1);
		 System.out.println(a);
		 assertEquals(123,a);
	}
}
