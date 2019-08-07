package com.cg.tms.service;

import java.util.List;
import java.util.Random;

import com.cg.tms.bean.TicketBean;
import com.cg.tms.bean.TicketCategory;
import com.cg.tms.dao.TicketDAO;
import com.cg.tms.dao.TicketDAOImpl;

public class TicketServiceImpl implements TicketService {
TicketDAO dao = new TicketDAOImpl();
	@Override
	public int raiseNewTicket(TicketBean ticketBean) {
		int ticketNo = generateTicketNo();
		ticketBean.setTicketNo(ticketNo);
		return dao.raiseNewTicket(ticketBean);
	}

	@Override
	public List<TicketCategory> listTicketCategory() {
		return dao.listTicketCategory();
	}
	private int generateTicketNo()
	{
		int ticketNo = new Random().nextInt(10000);
		return ticketNo;
	}
}
