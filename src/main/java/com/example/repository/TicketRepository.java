package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.binding.ticketres;

public interface TicketRepository extends JpaRepository<ticketres, Integer> {

}
