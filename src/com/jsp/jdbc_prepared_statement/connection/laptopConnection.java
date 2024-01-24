package com.jsp.jdbc_prepared_statement.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException ;

import com.mysql.cj.jdbc.Driver;

public class laptopConnection {
	
	public static Connection getlaptopConnection()
	{
		try {
		//step-1
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//step-2
		String url="jdbc:mysql://localhost:3306/jdbc-10am";
		String user="root";
		String Pass="root";
		 
		return DriverManager.getConnection(url, user, Pass);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}

}
