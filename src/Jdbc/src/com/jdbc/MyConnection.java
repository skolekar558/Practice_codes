package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MyConnection {
public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException{
	Connection con=null;
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysq://localhost:3306/employeedb","root","root");
	return con;
	
}
}
