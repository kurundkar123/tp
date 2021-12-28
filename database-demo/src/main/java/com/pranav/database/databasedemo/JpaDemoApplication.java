package com.pranav.database.databasedemo;




import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.pranav.database.databasedemo.entity.Person;
import com.pranav.database.databasedemo.jdbc.PersonJdbcDao;
import com.pranav.database.databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{
	
	
	@Autowired
	PersonJpaRepository repositroy;
	
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method 
		logger.info("all users -> {}",repositroy.findById(10002));
		logger.info("Update 10003 -> {}",repositroy.update(new Person(10003,"Tara","Berlin",new Date())));
		logger.info("Inserting 10004 -> {}",repositroy.insert(new Person(10004,"Peter","mirage",new Date())));
		repositroy.deleteById(10002);
		logger.info("all users ->{}",repositroy.findAll());

	}

}
