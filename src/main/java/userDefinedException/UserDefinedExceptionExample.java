package userDefinedException;

public class UserDefinedExceptionExample {

	public void checkException(int weight) throws UserDefinedException1 {
		if(weight<100) {
			throw new UserDefinedException1("Invalid weight..");
		}
	}
	public static void main(String[] args) {
		UserDefinedExceptionExample u = new UserDefinedExceptionExample();
		try {
			u.checkException(90);
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}

}
