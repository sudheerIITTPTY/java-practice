package com.sudheer.springindepth.xml;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class XmlJdbcConnection {
	
	public XmlJdbcConnection() {
		System.out.println("JDBC connection");
	}

}
