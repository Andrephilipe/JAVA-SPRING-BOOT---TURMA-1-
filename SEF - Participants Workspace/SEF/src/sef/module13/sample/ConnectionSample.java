package sef.module13.sample;
//Needs to be completed
import java.sql.*;

public class ConnectionSample {

	//	This source code tries to establish a connection to a MySQL server
	//	and displays a message concerning the error if connection fails
	public static void main(String[] args) {

		try {
			String url = "jdbc:mysql://localhost:3306/teste?characterEncoding=utf8";
			String user = "root";
			String pass = "123456";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			cn.setAutoCommit(false);
			System.out.println("Connection successfully established!");
			
			//Closing the connection
			cn.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Deu erro");
		}
	}

}
