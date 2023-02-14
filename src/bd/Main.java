package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		
		 try {
	     
	      Class.forName("com.mysql.jdbc.Driver");
	            
	     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecoleit",
	                "root", "");
	     
	     Statement stmt = connection.createStatement();
	     /*
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Donner le nom : ");
	     String nom =sc.nextLine();
	     
	     System.out.println("Donner l'email : ");
	     String email =sc.nextLine();
	     
	     System.out.println("Donner votre age : ");
	     int age = sc.nextInt();
	     
	     String sql="insert into etudiant (nom,email,age) values('"+nom+"','"+email+"','"+age+"')";
	     int res = stmt.executeUpdate(sql);
	     
	     System.out.println(res);
	     System.out.println(connection);
	     System.out.println("Connécté");
	     */
	     
	     // Affichage de toutes les data de la table étudiant
	     String rq = "select * from etudiant";
	     ResultSet rs = stmt.executeQuery(rq);
	     while(rs.next())
	     {
	    	 int id = rs.getInt("id");
	    	 String nom = rs.getString("nom");
	    	 String email = rs.getString("email");
	    	 int age = rs.getInt("age");
	    	 
	    	 System.out.println("ID : "+id+" Nom : "+nom+" Mail : "+email+" age : "+age);
	     }
	     
		 }
		 catch(Exception exception) {
			 System.out.println(exception.getMessage());
		 }
		 finally {
			 if(connection!=null) {
				 connection.close();
			 }
		 }
		 
		 System.out.println("Fin du programme");

	}

}