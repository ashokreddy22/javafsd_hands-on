package exceptionhandlers1;


public class handlersdemo {

	public static void main(String[] args) {
   try {
	   System.out.println("starting of try block");
	throw new Exception(":this is my error message");
   }
catch(Exception e) {
	System.out.println("occured");
	System.out.println(e.getMessage());
}
	}


}
