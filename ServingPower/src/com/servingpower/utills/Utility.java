package com.servingpower.utills;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utility {
	public static Connection getDBConnection()
	{
	Connection conn = null;
	try {
	    // db parameters
	    String url       = "jdbc:mysql://localhost:3306/ServingPower";
	    String user      = "root";
	    String password  = "root";
		
	    // create a connection to the database
	    conn = DriverManager.getConnection(url, user, password);
	    // more processing here
	    // ...	
	    return conn;
	} catch(SQLException e) {
	   System.out.println(e.getMessage());
	} finally {
		
	}
	return null;
	}

}
