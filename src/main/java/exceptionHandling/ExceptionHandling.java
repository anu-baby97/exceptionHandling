package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		int n=0;
		try {
			n = 10/0;
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("...");
		}
		
		System.out.println(n);
		

	}

}
