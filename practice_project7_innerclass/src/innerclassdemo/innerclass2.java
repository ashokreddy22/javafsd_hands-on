package innerclassdemo;

public class innerclass2 {
	private String a="avinah kumar";
	void display() {
	class inner{
		void read() {
			System.out.println(a+" reddy");
		}}
		inner i=new inner();
		i.read();
	}
	public static void main(String[] args) {
		innerclass2 ic=new innerclass2();
		
		
		ic.display();
	}

}
