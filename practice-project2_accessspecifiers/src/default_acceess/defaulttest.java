package default_acceess;
import java.util.Scanner;

public class defaulttest {
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a,b;
			System.out.println("enter a,b numbers");
			a= sc.nextInt();
			b=sc.nextInt();
			default_specifier de=new default_specifier();
			de.add(a, b);
		    
			sc.close(); 
	    }		
	     

}
