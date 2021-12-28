package com.pranav.database.databasedemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pranav.database.databasedemo.jdbc.PersonJdbcDao;


//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner{
	
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJdbcDao dao;
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		dao.findAll();
		logger.info("all users -> {}",dao.findAll());
	}

}
