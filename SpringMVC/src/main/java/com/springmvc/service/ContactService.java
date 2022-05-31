package com.springmvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.controller.Contacts;
import com.springmvc.dao.ContactDao;

@Service
public class ContactService {

	@Autowired
	private ContactDao contactDao;
	
	@Transactional
	public int createContact(Contacts contacts) {
	
		return this.contactDao.saveContact(contacts);
		
		
	}
}
