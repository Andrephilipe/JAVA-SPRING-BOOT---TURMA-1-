package sef.module13.sample;
//Needs to be completed
import java.sql.*;

public class StatementSample {

	public static void main(String[] args) {
		try{
			String url = "jdbc:mysql://localhost:3306/teste?characterEncoding=utf8";
			String user = "root";
			String pass = "123456";
			
			//1 - Load the driver
			
			Class.forName("com.mysql.jdbc.Driver");
			//2 - Obtain a connection
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
			
			//3 - Create a Statement
			Statement st = (Statement) cn.createStatement();
			String criaTabela = "CREATE TABLE TESTE1 (NOME VARCHAR(30));";
			String inserirNome = "INSERT INTO TESTE1 (NOME) VALUE ('Andre')";
			st.executeQuery(inserirNome);

			//4 - Execute a query
			ResultSet rs = (ResultSet) cn.createStatement();
			String selectTable = "SELECT * FROM TESTE1";
			rs.executeQuery(selectTable);
				
			
			System.out.println("ID\tComplete Name\tSalary" + st);
			//5 - Traverse through the ResultSet and print all the records 
			//while(rs.next()){
						//}
			
			//closing the connection
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
