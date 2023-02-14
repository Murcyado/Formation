package day2;

import java.sql.*;
import java.util.Scanner;

public class CrudEcole {

	// Exercice table "école"
		public static void addEcole(Statement stmt) throws SQLException {
		    Scanner sc = new Scanner(System.in);

		    System.out.println("Donner le nom de l'école");
		    String nom = sc.nextLine();

		    System.out.println("Donner l'adresse de l'école");
		    String adresse = sc.nextLine();

		    System.out.println("Donner le nombre total d'étudiants de l'école");
		    int totalEtudiant = sc.nextInt();

		    String sql = "INSERT INTO ecole (nom, adresse, totaletudiant) VALUES ('" + nom + "', '" + adresse + "', '" + totalEtudiant + "')";
		    int res = stmt.executeUpdate(sql);

		    if (res > 0) {
		        System.out.println("L'école a été ajoutée avec succès.");
		    } else {
		        System.out.println("Erreur lors de l'ajout de l'école.");
		    }
		}


	    public static void displayEcole(Statement stmt) throws SQLException {
	        ResultSet rs = null;
	        String rq = "SELECT * FROM ecole";

	        rs = stmt.executeQuery(rq);

	        while (rs.next()) {
	            int id = rs.getInt("id");
	            String nom = rs.getString("nom");
	            String adresse = rs.getString("adresse");
	            int totalEtudiant = rs.getInt("totaletudiant");

	            System.out.println("ID : " + id + " | Nom : " + nom + " | Adresse : " + adresse + " | Total d'étudiants : " + totalEtudiant);
	        }
	    }

		public static void main(String[] args) throws Exception {

			Connection connection = null;
			Statement stmt = null;

			try {

				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecoleit", "root", "");
				// System.out.println(connection);
				stmt = connection.createStatement();
				
				//Exercice table "école"
				// 1)Ajout d'une école dans la table "ecole"
				addEcole(stmt);
				// 2)Affichage de toutes les écoles
				displayEcole(stmt);

				// System.out.println(connection);
			} catch (Exception exception) {
				System.out.println("Exception : " + exception.getMessage());
			}

			finally {
				if (connection != null)
					connection.close();
			}

			System.out.println("Fin du programme...");

		}


}
