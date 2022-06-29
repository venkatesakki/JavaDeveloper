package com.training.utils;
import java.sql.*;
import java.util.ResourceBundle;

//import com.example.demp.model.BookService;

public class ConnectionFactory {
	
	public static Connection getPostgresConnection()
	{
		Connection con=null;
		ResourceBundle labels =ResourceBundle.getBundle("application");
		
		try
		{
			String url=labels.getString("datasource.postgres.url");
			String userName=labels.getString("datasource.postgres.username");
			String password=labels.getString("datasource.postgres.password");
			
			String driverClass=labels.getString("datasource.postgres.driverclass");
			
			Class.forName(driverClass);
//			
//			BookService service=new BookService();
//			Class<?> cls=Class.forName("com.example.demp.model.BookService");
//			
//			BookService s=(BookService)cls.newInstance();
			
			con=DriverManager.getConnection(url,userName,password);
		}
		catch (SQLException |ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	
	
//	public static connection getMySqlConnection()
//	{
//		
//	}
	
}
