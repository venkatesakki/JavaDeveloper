package com.training.servlet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
		public static String DB_DRIVER_CLASS = "org.postgresql.Driver";
		private static String DB_URL = "jdbc:postgresql://localhost:5432/vastpro1";
		private static String DB_USER = "postgres";
		private static String DB_PASSWORD = "postgres";

		public static Connection getConnection() throws SQLException {
			Connection con = null;
			try {
				Class.forName(DB_DRIVER_CLASS);
				System.out.println("suucessfully connected ");

			} catch (Exception e) {
				System.out.println("error in the connection :");
			}

			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			return con;
		}
	}


