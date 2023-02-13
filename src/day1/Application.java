package day1;

import java.time.LocalDate;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		//Instances
		// Animals
		Animals a1 = new Animals();// appel au constructeur par défaut
		
		Animals a2 = new Animals();// appel au constructeur par défaut
		
		System.out.println(a1.nom); // null
		System.out.println(a1.age); // 0
		
		LocalDate naissance = LocalDate.of(2022, 7, 20);
		Animals a3 = new Animals("Rex", 3, naissance);
		System.out.println(a3.nom);
		System.out.println(a3.age);
		System.out.println(a3.dateNaissance); 
		
		System.out.println(Animals.ageMax); 
		
		System.out.println(a1.ageMax); 
		System.out.println(a2.ageMax); 
		System.out.println(a3.ageMax); 
		
		
		// Voiture
		LocalDate immatriculation = LocalDate.of(2022, 7, 20);
		Voiture v1 = new Voiture("Renault","Clio", 200, immatriculation);
		//System.out.println(v1.toString());
		System.out.println(v1);
		//System.out.println(v1.modele);
		//System.out.println(v1.vitesse);
		//System.out.println(v1.dateImmatriculation);
		
		Voiture v2 = new Voiture("Citroen","C3", 150,immatriculation);
		System.out.println(v2);
		
		Voiture v3 = new Voiture("Peugeot","5008", 192,immatriculation);
		System.out.println(v3);
		
		//System.out.println(Voiture.nbreVoitureCree);
		
		Voiture.getNbreVoitures(); // appel à la méthode de la classe
		
		/*System.out.println(v1.nbreVoitureCree); 
		System.out.println(v2.nbreVoitureCree); 
		System.out.println(v3.nbreVoitureCree); */
		
	}
}
