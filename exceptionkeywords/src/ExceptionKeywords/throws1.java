package ExceptionKeywords;

public class throws1 {

	public static void main(String[] args) throws ArithmeticException{

	
		try {
			throws1 td = new throws1();
			int a = 10;
			System.out.println("value" + a);
			td.display(a);
		} catch (RuntimeException e) {
			System.out.println("exception occured is "+e.getMessage());
		}
	}

	void display(int a)
	{
		int b = 0;
		int c=a/b;
	
		
	System.out.println("throws keyword usd");}

}


