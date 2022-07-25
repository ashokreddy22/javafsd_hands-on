package ExceptionKeywords;

public class Throw1 {

	public static void main(String[] args) {
		try {
			Throw1 td = new Throw1();
			int a = 1;
			System.out.println("value" + a);
			td.adding(a);
		} catch (RuntimeException e) {
			System.out.println( e.getMessage());
		}
	}

	void adding(int a) {
		int b = 5;
		if (a < b) {
			throw new RuntimeException("cannot add greater than  a ");
		}
	}
}