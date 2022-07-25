package exception1;

public class TryCatch {

	public static void main(String[] args) {
       int a[]= {10,49,58};
       int n=3;
       try {
       for (int i=0;i<=n;i++) {System.out.println("array elements are:"+a[i]);}
       }
       catch(ArrayIndexOutOfBoundsException e) {
    	   System.out.println("array exception handled");
       }System.out.println("try and catch statements are used");
       }
	}


