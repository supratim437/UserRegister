package com.portfolio.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.demo.contactEntity.Contact;
import com.portfolio.demo.contact_services.Contact_service;

@RestController
@RequestMapping("/portfolio")
@CrossOrigin(origins = "*")
public class Contact_Controller {

	@Autowired
	Contact_service contact_service;
	
	@PostMapping("/add")
	public Contact addContact(@RequestBody Contact contact) {
		return this.contact_service.saveContact(contact);
		
	}
	
	 

}
