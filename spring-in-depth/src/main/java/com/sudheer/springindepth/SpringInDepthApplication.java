package com.sudheer.springindepth;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sudheer.springindepth.scope.PersonDOA;
import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringInDepthApplication {
	
	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringInDepthApplication.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringInDepthApplication.class, args);
		
		PersonDOA personDOA = context.getBean(PersonDOA.class);
		PersonDOA personDOA2 = context.getBean(PersonDOA.class);
		System.out.println(personDOA);
		System.out.println(personDOA2);
		
		LOGGER.info("{}",personDOA);
		LOGGER.info("{}",personDOA.getJdbcConnection());
		LOGGER.info("{}",personDOA.getJdbcConnection());
		LOGGER.info("{}",personDOA2);
		LOGGER.info("{}",personDOA2.getJdbcConnection());
	}

}
