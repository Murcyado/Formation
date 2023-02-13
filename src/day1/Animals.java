package day1;

import java.time.LocalDate;

public class Animals {
	// Attributs d'instance
	String nom;
	int age;
	LocalDate dateNaissance;
	// Attributs de classe
	static int ageMax = 150;
	
	
	//Constructeurs
	
	public Animals() 
	{
		System.out.println("Construction d'un Animal");
		
	}
	
	public Animals(String nom, int age, LocalDate ld) 
	{
		System.out.println("Construction d'un Animal avec 2 paramètres");
		this.nom = nom;
		this.age = age;
		this.dateNaissance = ld;
	}
	
	//Méthode d'instance
	public void info()
	{
		System.out.println("Nom : "+this.nom);
		System.out.println("Age : "+this.age);
		System.out.println("Date de naissance : "+this.dateNaissance);
	}
}
