package lesException;

public class Main {

	public static void main(String[] args) {
		//NullPointerException
		/*String formation="java";
		//String formation=null;
		System.out.println(formation.length());
		System.out.println("Suite du programme ...");*/
		//ArithmeticException
		int x = 10;
		int y = 10;
		//int y = 0;
		
		System.out.println("x/y = " + (x/y));
		
		int tab[] = new int[3];
		tab[0] = 10;
		tab[1] = 20;
		tab[2] = 30;
		for(int i = 0; i<=tab.length; i++)
		{
			System.out.print(tab[i]+"\t");
		}
		
		//String formation="java";
		String formation=null;
		try {
			System.out.println(formation.length());
		}
		catch(Exception ex) {
		//catch(NullPointerException ex) {
			System.out.println("Problème ..." + ex.getMessage());
			ex.printStackTrace();
			return;
		}
		finally {
		System.out.println("Suite du programme ...");
		}
	}

}
