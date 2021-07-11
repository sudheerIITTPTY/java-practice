package com.sudheer.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CompPersonDOA {
	
	@Autowired
	CompJDBCConnection jdbcConnection;

	public CompJDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(CompJDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	

}
