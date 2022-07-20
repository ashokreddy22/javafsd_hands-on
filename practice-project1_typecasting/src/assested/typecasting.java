package assested;
import java.util.Scanner;
public class typecasting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
     char ch;
     System.out.println("enter a character :");
     ch=sc.next().charAt(0);
     System.out.println("implicit typecasting");
     int a=ch;
     System.out.println("Typecasting from char to int " + a);
     float b=ch;
     System.out.println("Typecasting from char to float " + b);
     double c=ch;
     System.out.println("Typecasting from char to double " + c);
     long d=ch;
     System.out.println("Typecasting from char to long " + d);
     System.out.println('\n');
     System.out.println("explicit typecasting");
     double dou=65.46;
     int e=(int)dou;
     System.out.println("Typecasting from double to int " + e);
     float f=(float)dou;
     System.out.println("Typecasting from double to float " + f);
     long g=(long)dou;
     System.out.println("Typecasting from double to long " + g);
     short h=(short)dou;
     System.out.println("Typecasting from double to short "+ h);
     char i=(char)dou;
     System.out.println("Typecasting from double to char " + i);
     	 
     
	}

}
