package innerclassdemo;

public class innerclass1 {
	private String a="ashok kumar";
	class inner{
		void read() {
			System.out.println(a+" reddy");
		}
	}

	public static void main(String[] args) {
innerclass1 ic=new innerclass1();
innerclass1.inner in=ic.new inner();
in.read();
	}

}
