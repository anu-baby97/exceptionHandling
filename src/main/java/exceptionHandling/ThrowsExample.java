package exceptionHandling;

import java.io.IOException;

public class ThrowsExample {

	public static void myMethod(int num) throws IOException, ClassNotFoundException {
		
		if(num==1) {
			throw new IOException("IO Exception occured");
		}
		else {
			throw new ClassNotFoundException("Class not found");
		}
	}
	public static void main(String[] args) {
		try {
			myMethod(10);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
