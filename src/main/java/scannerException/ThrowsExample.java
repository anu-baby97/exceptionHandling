package scannerException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

	public static void throwsExampleMethod() throws FileNotFoundException {
		FileInputStream f = new FileInputStream("S:\\file.java");
	}
	public static void main(String[] args) {
		
		try {
			throwsExampleMethod();
		} catch (NullPointerException e) {
			System.out.println("Null Pointer..");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
