package day1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		//Instances
		Animals a1 = new Animals();// appel au constructeur par défaut
		
		Animals a2 = new Animals();// appel au constructeur par défaut
		
		System.out.println(a1.nom); // null
		System.out.println(a1.age); // 0
		
		Animals a3 = new Animals("Rex", 3);
		System.out.println(a3.nom);
		System.out.println(a3.age); 
	}

}
