package day1;

import java.time.LocalDate;

public class Voiture {
	String marque;
	String modele;
	int vitesse;
	LocalDate dateImmatriculation;
	
	// Attributs de classe
	static int nbreVoitureCree = 0;
	
	public Voiture() {}
	
	public Voiture(String marque, String modele, int vitesse, LocalDate dateImmatriculation)
	{
		System.out.println("Construction d'une voiture");
		this.marque = marque;
		this.modele = modele;
		this.vitesse = vitesse;
		this.dateImmatriculation = dateImmatriculation;
		//nbreVoitureCree = nbreVoitureCree + 1;
		nbreVoitureCree++;
	}
	
	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", modele=" + modele + ", vitesse=" + vitesse + ", dateImmatriculation="
				+ dateImmatriculation + "]";
	}
	
	public static void getNbreVoitures()
	{
		System.out.println("Nombre de voiture en mémoire : " + nbreVoitureCree);
	}
	
}
