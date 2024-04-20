package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.binding.ticketres;
import com.example.repository.TicketRepository;

@Service
public class TicketRe implements TicketDao {
	@Autowired
  TicketRepository repository;
	 
	
	@Override
	public String AddTicket(ticketres res) {
		repository.save(res);
		return "ticket added....";
	}

	@Override
	public ticketres getTicket(Integer id) {
		Optional<ticketres> byId = repository.findById(id);
		ticketres ticketres = byId.get();
		return ticketres;
	}

	
}
