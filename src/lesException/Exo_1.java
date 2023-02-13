package lesException;

import java.util.Scanner;

public class Exo_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int x, y;
	    double resultat;  
	    System.out.print("Entrez le premier entier : ");
	    x = sc.nextInt();
	    System.out.print("Entrez le deuxième entier : ");
	    y = sc.nextInt();
	      
	    try {
	       resultat = x / y;
	       System.out.println("Le résultat est : " + resultat);
	    } 
	    catch (ArithmeticException e) {
	        System.out.println("Impossible de diviser par 0" + e.getMessage());
	        e.printStackTrace();
			return;
	    } 
	    finally {
	    	if(x != 0 || y!=0) {
	         System.out.println("La division est correcte");
	    	}
	    	else {
	    		System.out.println("Division impossible");
	    	}
	    }
	}
}
