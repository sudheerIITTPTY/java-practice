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
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sudheer.scan.CompPersonDOA;
import com.sudheer.springindepth.cdi.SomeCdiBusiness;
import com.sudheer.springindepth.scope.PersonDOA;
import com.sudheer.springindepth.xml.XmlPersonDOA;

public class SpringInDepthApplicationXml {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringInDepthApplicationXml.class);
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		XmlPersonDOA xmlPersonDoa = context.getBean(XmlPersonDOA.class);
		LOGGER.info("Beans Loaded -> {}",(Object)context.getBeanDefinitionNames());
		System.out.println(xmlPersonDoa);
		context.close();
	}

}
