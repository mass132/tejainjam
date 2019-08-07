package com.cg.tms.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.tms.bean.TicketBean;
import com.cg.tms.bean.TicketCategory;

public class TicketDAOImpl implements TicketDAO {
	private static Map<String, TicketCategory> ticketCategory = new HashMap<String, TicketCategory>();
	private static Map<Integer, TicketBean> tickets = new HashMap<Integer, TicketBean>();

	public static Map<String, TicketCategory> getTicketCategoryEntries() {
		ticketCategory.put("tc001", new TicketCategory("tc001", "software installation"));
		ticketCategory.put("tc002", new TicketCategory("tc002", "mailbox creation"));
		ticketCategory.put("tc003", new TicketCategory("tc003", "mailbox issues"));
		return ticketCategory;
	}

	@Override
	public int raiseNewTicket(TicketBean ticketBean) {
		tickets.put(ticketBean.getTicketNo(), ticketBean);
		return ticketBean.getTicketNo();
	}

	@Override
	public List<TicketCategory> listTicketCategory() {
		List<TicketCategory> list = new ArrayList<TicketCategory>(getTicketCategoryEntries().values());
		return list;
	}

	

}
