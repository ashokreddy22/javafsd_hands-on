package ExceptionKeywords;

public class customexception2 {

	public static void main(String[] args) {
   try {
	throw new MyException("data");
   }
catch(MyException e) {
	System.out.println("occured");
	System.out.println(e.getMessage());
}
	}

}
