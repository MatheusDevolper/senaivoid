# Spring Boot project test + CRUD example with MySQL Database + Github for TCC Matheus

For more details, please visit:

In this tutorial, you will learn how to build a full stack React + Spring Boot example with a CRUD App.
The back-end server uses Spring Boot with Spring Web MVC for REST Controller and Spring Data JPA for interacting with MySQL database. 
Front-end side is made with stack React.

We will build a full-stack Tutorial Application in that:

- Each resorces has .......
- We can create a ticket, retrieve, update, delete .
- We can also find ticket and look at your progress .
- We can below shows screenshots of our System...


Details about the resources of api:
1.Resource: status
// http://localhost:8082/api/v1/status
	response: String 
		"Application Ticket - Online Active"
		
2.Resource: tickets
// http://localhost:8082/api/v1/tickets
	response: List of ticket object 
		[
			{
				"id" : 1,
				"title" : "Create a application for Ticket to register"
				"description" : "Create a application for Ticket to register in Java"
				"user" : "Master"
			},
			{
				"id" : 2,
				"title" : "Create a application for Ticket to register"
				"description" : "Create a application for Ticket to register in Java"
				"user" : "Master"
			},
			...
		]
	
2.Resource: login
	request: A Login object
	{
		"id": 1,
		"email": "maria@gmail.com",
		"password": "xxx",
		"status": true
	}
// http://localhost:8082/api/v1/login
	response: If email and password is trust return a login object
	{
		"id": 1,
		"email": "maria@gmail.com",
		"password": "xxx",
		"status": true
	}
