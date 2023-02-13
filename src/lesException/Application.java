package lesException;

public class Application {
	
	public static void affichage() throws Exception
	{
		
	}
	
	public static void info() throws NullPointerException
	{
		System.out.println("Simple message");
		
		throw new NullPointerException("Juste un test");
	}
	public static void main(String[] args) throws Exception{
		affichage();
		
		/*try {
		affichage();
		}
		catch(Exception ex) {}*/
		info();
		
		try {
		info();
		}
		catch(NullPointerException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

}
