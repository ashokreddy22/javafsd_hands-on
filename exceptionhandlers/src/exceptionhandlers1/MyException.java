package exceptionhandlers1;

public class MyException extends Exception { 
	 String s1;
	 MyException(String s2) {
		s1=s2;
	}
	public String StringtoString() {
		
		return ("my exception occured is:"+s1);
	
	}

}
