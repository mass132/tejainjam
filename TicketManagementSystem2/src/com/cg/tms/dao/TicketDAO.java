package com.cg.tms.dao;

import java.util.List;
import java.util.Map;

import com.cg.tms.bean.TicketBean;
import com.cg.tms.bean.TicketCategory;

public interface TicketDAO {
	public int raiseNewTicket(TicketBean ticketBean);
	public List<TicketCategory> listTicketCategory();
}
