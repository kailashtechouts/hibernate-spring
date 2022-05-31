package com.spring.configinitializer;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource datasource;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(datasource).passwordEncoder(passwordEncoder)
				.usersByUsernameQuery("select username,password,enabled from users where username =?")
				.authoritiesByUsernameQuery("select username, authority as role from authority where username=?");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
		.antMatchers("/main-page","/cart/*","/order/*","/cart","/order").authenticated()
		.antMatchers("/Register").permitAll()
		.and()
		.formLogin().loginPage("/login1").defaultSuccessUrl("/main-page")
		.and()
		.logout()
		.and()
		.csrf().disable();
	}
}
