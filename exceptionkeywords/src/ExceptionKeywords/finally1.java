package ExceptionKeywords;

public class finally1 {

	public static void main(String[] args) {

		int a = 3, b = 0, c=10;

		try {

			c = a / b;

		}
		catch (ArithmeticException e) {
			System.out.println("error occured is: " + e.getMessage());
		}
		finally {

			System.out.println("the value is:" + c);
			}
	}	
}

