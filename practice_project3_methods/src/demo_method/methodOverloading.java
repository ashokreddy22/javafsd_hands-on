package demo_method;

public class methodOverloading {
	void add(int a,int b) {
		int c=a+b;
		System.out.println("method1 "+c);
		
	}
	void add(int a,int b, int c) {
		int d=a+b+c;
		System.out.println("method2 "+d);
		
	}
	public static void main(String[] args) {
		 methodOverloading mo=new  methodOverloading();
		 mo.add(10,20);
		 mo.add(49,37 , 29);
	}

}
