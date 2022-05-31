package com.spring.dao;

import org.springframework.stereotype.Repository;

import com.spring.details.Authorities;
import com.spring.details.User;

@Repository
public interface UserDao {

	public void saveUser(User user);

	public void saveAuthorities(Authorities authorities);
}
