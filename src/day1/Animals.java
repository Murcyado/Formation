package day1;

public class Animals {
	// Attributs d'instance
	String nom;
	int age;
	
	// Attributs de classe
	static int ageMax = 150;
	
	
	//Constructeurs
	
	public Animals() 
	{
		System.out.println("Construction d'un Animal");
		
	}
	
	
	public Animals(String nom, int age) 
	{
		System.out.println("Construction d'un Animal avec 2 paramètres");
		this.nom = nom;
		this.age = age;
	}
}
