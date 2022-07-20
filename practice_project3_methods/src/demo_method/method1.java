package demo_method;

public class method1 {	public int add(int b,int c) {
	int a=b+c;
	return a;
}

public static void main(String[] args) {
	method1 m=new method1();
	int a=m.add(20,33);
System.out.println(a);
}

}
