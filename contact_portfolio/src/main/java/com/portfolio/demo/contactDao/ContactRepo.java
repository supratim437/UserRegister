package com.portfolio.demo.contactDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.demo.contactEntity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer>{

}
