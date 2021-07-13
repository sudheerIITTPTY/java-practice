package com.sudheer.scan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CompJDBCConnection {
	
	public CompJDBCConnection() {
		System.out.println("JDBC connection");
	}

}
