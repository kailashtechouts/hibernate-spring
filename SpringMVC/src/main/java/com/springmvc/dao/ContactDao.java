package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.controller.Contacts;

@Repository
public class ContactDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public int saveContact(Contacts contacts) {
		
		int id = (Integer) this.hibernateTemplate.save(contacts);
		return id;
		
	}
}
