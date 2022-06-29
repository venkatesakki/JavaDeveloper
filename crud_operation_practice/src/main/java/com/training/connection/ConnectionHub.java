package com.training.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionHub {
	
	public static Connection getConnection()
	{
		Connection con=null;
		ResourceBundle label=ResourceBundle.getBundle("application");
		try {
			
			String url=label.getString("datasource.postgres.url");
			String userName=label.getString("datasource.postgres.username");
			String password=label.getString("datasource.postgres.password");
			
			
			String driverClass=label.getString("datasource.postgres.driverclass");
			Class.forName(driverClass);
			con=DriverManager.getConnection(url,userName,password);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return con;
	}

}
