package day1;

import java.time.LocalDate;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		//Instances
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
	}

}
