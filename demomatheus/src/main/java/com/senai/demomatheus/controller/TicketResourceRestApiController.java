package com.senai.demomatheus.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.demomatheus.model.Login;
import com.senai.demomatheus.model.Prioridade;
import com.senai.demomatheus.model.Ticket;

@RestController
@RequestMapping(path="/api/v1")
public class TicketResourceRestApiController {
	
	List<Ticket> ticketList;
	
	public TicketResourceRestApiController() {
		Prioridade prior01 = new Prioridade(1, "Alta", "Esta questão deve ser atendida em 24 horas");
		Prioridade prior02 = new Prioridade(2, "Média", "Esta questão deve ser atendida em 48 horas");
		Prioridade prior03 = new Prioridade(3, "Baixa", "Esta questão deve ser atendida em 72 horas");
		
		ticketList = new ArrayList<>();
		ticketList.add(
				new Ticket(
						1, 
						"Create a application for Ticket to register", 
						"Create a application for Ticket to register in Java", 
						"Matheus Junior",
						prior02
						)
				);
		ticketList.add(
				new Ticket(
						2, 
						"Create a front-end application", 
						"Create a web application for consume back-end application", 
						"Lucas Holy",
						prior01
						)
				);
				
				
	}
	@GetMapping("/status")
	public String status() {
		return "Application Ticket - Online Active";
	}
	
	@GetMapping(value = "tickets", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Ticket> getListOfTickets() {
		
		
		return ticketList;
	}
	
	@GetMapping(value = "login", produces=MediaType.APPLICATION_JSON_VALUE)
	public Login login(@RequestBody Login login) {
		Login loginAccess = login;
		if(loginAccess.getStatus()) {
			return loginAccess;
		}
		else {
			return loginAccess;
		}
		
	}
	
	@PostMapping("ticket")
	public ResponseEntity save(@RequestBody Ticket tic) {
	    if(tic.getTitle() != "" || tic.getTitle() != null) {
	    	ticketList.add(tic);
	    }
	    return ResponseEntity.ok(ticketList);
	}
}
