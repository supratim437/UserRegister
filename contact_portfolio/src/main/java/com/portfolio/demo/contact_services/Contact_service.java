package com.portfolio.demo.contact_services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.demo.contactDao.ContactRepo;
import com.portfolio.demo.contactEntity.Contact;

@Service
public class Contact_service {
	@Autowired
	ContactRepo contactRepo;
	
	public Contact saveContact(Contact contact) {
		contactRepo.save(contact);
		return contact;
		
	}

}
