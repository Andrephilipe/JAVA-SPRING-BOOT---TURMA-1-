package sef.module13.sample;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteSample {

	public static void main(String[] args) {
		try{
			String url = "jdbc:mysql://localhost/teste";
			String user = "root";
			String pass = "abcd1234";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			cn.setAutoCommit(false);
			System.out.println("Connection successfully established!");
			
			//1 - Create a PreparedStatement with a query "delete from employee where id = ?" 
			PreparedStatement pStmt = ;
			
			//	Change parameter to any keyword desired, if a record
			// 	matches the query then it will be displayed
			pStmt.setString(1,"6");
			
			
			//2 - Execute this query using executeUpdate()
			int rows = ;
			cn.commit();	
			System.out.println(rows + " row(s)deleted!");
			
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

	}
}
