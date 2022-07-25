package polymorphism1;

public class polyAddition {
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public int add(int a,int b) {
		return a+b;}
	public double add(double a,double b,double c) {
		return a+b+c;}
	public static void main(String[] args) {

		polyAddition a=new polyAddition();
		System.out.println(a.add(10, 20));
		System.out.println(a.add(10, 20,60));
		System.out.println(a.add(10.5, 20.78,56.8));
	}

}
