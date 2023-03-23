package scannerException;

import java.util.Scanner;

public class ExceptionScanner {

	public static void main(String[] args) {
		int num1,num2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		num1=s.nextInt();
		
		System.out.println("Enter number 2");
		num2=s.nextInt();
		
		try {
			int div=num1/num2;
			System.out.println("Division result: "+div);
		}
		
		catch (ArithmeticException e) {
			System.out.println("Division by zero is not possible..");
			System.out.println("Error Message: "+e);
		}
		catch (Exception e) {
			System.out.println("Generic Exception");
		}
		
		System.out.println("Outside try catch block");
		
	}

}
