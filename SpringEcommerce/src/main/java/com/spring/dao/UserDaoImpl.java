package com.spring.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.details.Authorities;
import com.spring.details.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void saveUser(User user) {

		this.hibernateTemplate.save(user);
	}

	public void saveAuthorities(Authorities authorities) {

		this.hibernateTemplate.save(authorities);

	}
}
