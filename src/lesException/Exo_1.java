package lesException;

import java.util.Scanner;

public class Exo_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a, b, resultat;
	      
	    System.out.print("Entrez le premier nombre : ");
	    a = sc.nextInt();
	    System.out.print("Entrez le deuxième nombre : ");
	    b = sc.nextInt();
	      
	    try {
	       resultat = a / b;
	       System.out.println("Le résultat de la division est : " + resultat);
	    } 
	    catch (ArithmeticException e) {
	         System.out.println("Impossible de diviser par 0");
	    } 
	    finally {
	         System.out.println("La division est correcte");
	    }
	}
}
