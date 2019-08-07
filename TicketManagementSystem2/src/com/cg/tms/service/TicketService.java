package com.cg.tms.service;

import java.util.List;

import com.cg.tms.bean.TicketBean;
import com.cg.tms.bean.TicketCategory;

public interface TicketService {
	public int raiseNewTicket(TicketBean ticketBean);
	public List<TicketCategory> listTicketCategory();

}
