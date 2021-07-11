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

import com.sudheer.scan.CompPersonDOA;
import com.sudheer.springindepth.cdi.SomeCdiBusiness;
import com.sudheer.springindepth.scope.PersonDOA;

@Configuration
@ComponentScan("com.sudheer.springindepth.cdi")
public class SpringInDepthApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringInDepthApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringInDepthApplication.class);
		
		SomeCdiBusiness business = context.getBean(SomeCdiBusiness.class);
		System.out.println(business);
		LOGGER.info("{}",business);

	}

}
