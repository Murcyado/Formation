package lesException;

public class Application {
	
	public static void info() throws NullPointerException
	{
		System.out.println("Simple message");
		
		//throw new NullPointerException("Juste un test");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		info();
	}

}
