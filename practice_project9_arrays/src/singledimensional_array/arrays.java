package singledimensional_array;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		int n;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		int a[] = new int[5];
		System.out.println("enter array elements");
		a[n]=sc.nextInt();
		for (int i = 1; i <= n; i++) {
			
          a[i] = sc.nextInt();
			sum=sum+a[i];
			
		
				System.out.println(sum);}
	}
		

	}

	


