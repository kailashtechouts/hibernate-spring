package com.springjdbc.securityDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.security.SignUpDTO;

@Repository
public class SignUpDaoImpl implements SignUpDao{
	
	@Autowired
	private JdbcTemplate jdbcTempalte;
	
	@Override
	public void saveUser(SignUpDTO signupdto) {
		
		String sql = "insert into users values(?,?,?)";
		String sql2 = "insert into authorities values(?,?)";
		
		
	jdbcTempalte.update(sql, signupdto.getUsername(), signupdto.getPassword(), 1);
	jdbcTempalte.update(sql2, signupdto.getUsername(), "USER");		
	}

}
