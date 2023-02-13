package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		
		 try {
	     
	      Class.forName("com.mysql.jdbc.Driver");
	            
	     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecoleit",
	                "root", "");
	     
	     Statement stmt = connection.createStatement();
	     
	     String nom ="Noah C";
	     String email ="noah.caroux@ecole-it.com";
	     int age = 21;
	     
	     String sql="insert into etudiant (nom,email,age) values('"+nom+"','"+email+"','"+age+"')";
	     int res = stmt.executeUpdate(sql);
	     System.out.println(res);
	     System.out.println(connection);
	     System.out.println("Connécté");
		 }
		 catch(Exception exception) {
			 System.out.println(exception.getMessage());
		 }
		 finally {
			 if(connection!=null) {
				 connection.close();
			 }
		 }

	}

}