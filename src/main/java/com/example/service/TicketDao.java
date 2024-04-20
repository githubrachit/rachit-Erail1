package com.example.service;

import com.example.binding.ticketres;

public interface TicketDao {

	public String AddTicket(ticketres res);
	public ticketres getTicket(Integer id);
}
