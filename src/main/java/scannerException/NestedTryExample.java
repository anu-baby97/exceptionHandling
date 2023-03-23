package scannerException;

public class NestedTryExample {

	public static void main(String[] args) {
		// main try
		try {
			// second try
			try {
				// third try
				try {
					int arr[] = { 1, 2, 3, 4 };
					System.out.println(arr[5]);
				} catch (ArithmeticException e1) {
					System.out.println("Arithmetic Exception..");
				}
			} catch (ArithmeticException e2) {
				System.out.println("Arithmetic Exception..");
			}

		} catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println("Array Index out of Bound Exception..");
		} 
		catch (NullPointerException e4) {
			System.out.println("Null POinter Exception..");
		} 
		catch (Exception e5) {
			System.out.println("Generic Exception..");
		}
		finally {
			System.out.println("This is my finally block");
		}

	}
		

}

