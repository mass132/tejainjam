package com.cg.tms.dao;
import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;
import com.cg.tms.bean.TicketCategory;
import com.cg.tms.dao.TicketDAO;
import com.cg.tms.dao.TicketDAOImpl;
public class JunitTest {
	TicketDAO dao = new TicketDAOImpl();
	TicketCategory bean=new TicketCategory("KBH","455");
	@Test
	 public void A()
	{
		 List a= dao.listTicketCategory();
		 System.out.println(a);
		 assertEquals("KBH",a);
	}
}

