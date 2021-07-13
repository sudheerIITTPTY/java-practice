package com.sudheer.springindepth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.sudheer.scan.CompPersonDOA;
import com.sudheer.springindepth.cdi.SomeCdiBusiness;
import com.sudheer.springindepth.properties.SomeExternalService;
import com.sudheer.springindepth.scope.PersonDOA;

@Configuration
@ComponentScan
//app.properties
@PropertySource("classpath:app.properties")
public class SpringInDepthPropertiesApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringInDepthPropertiesApplication.class);
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringInDepthPropertiesApplication.class);
		
		SomeExternalService someExternalService = context.getBean(SomeExternalService.class);
		 System.out.println(someExternalService.returnServiceURL());
		LOGGER.info("{}",someExternalService);
		context.close();
	}

}
