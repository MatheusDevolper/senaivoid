package com.senai.demomatheus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1")
public class TicketResourceRestApiController {
	@GetMapping("/status")
	public String status() {
		return "Application Ticket - Online Active";
	}
}
