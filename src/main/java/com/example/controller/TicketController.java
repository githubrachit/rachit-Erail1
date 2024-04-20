package com.example.controller;

import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.TicketInfo;
import com.example.binding.ticketres;
import com.example.service.TicketRe;

@Controller
public class TicketController {
	@Autowired
	TicketRe re;

	@GetMapping("/")
	public String getData(Model model) {
		TicketInfo req = new TicketInfo();
		model.addAttribute("request", req);
		return "index";
	}

	@PostMapping("/success")
	public String handleData(Model model, TicketInfo req) {
		ticketres res = new ticketres();
		BeanUtils.copyProperties(req, res);
		res.setPnr(req.getFirstName() + UUID.randomUUID());
		String ticket = re.AddTicket(res);
		model.addAttribute("msg", ticket);
		return "success";

	}
	
    @ResponseBody
	@PostMapping(value = "/ticket", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<String> generateTicket(@RequestBody TicketInfo req) {
		ticketres res = new ticketres();
		BeanUtils.copyProperties(req, res);
		res.setPnr(req.getFirstName() + UUID.randomUUID());
		String ticket = re.AddTicket(res);
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);

	}
    @ResponseBody
	@GetMapping("/ticket/{id}")
	public ResponseEntity<ticketres> getTicket(@PathVariable Integer id) {
		ticketres ticket = re.getTicket(id);
		return new ResponseEntity<>(ticket, HttpStatus.OK);
	}
}
