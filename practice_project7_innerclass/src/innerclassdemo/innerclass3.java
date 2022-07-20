package innerclassdemo;
abstract class singleclass{
	public abstract void read();}

public class innerclass3 {

	public static void main(String[] args) {
		singleclass sc=new singleclass() {
			public void read() {
				System.out.println("ashok reddy");
			}
		};
		sc.read();
	}

}
