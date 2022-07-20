package packpublic2;
import packpublic1.public_specifier1;

public class access_specifier2 {
	public void div() {
		int c=20,d=5;
		System.out.println("implement how public specifier in two packages "+c/d);
	}

	public static void main(String[] args) {
		public_specifier1 ps1=new public_specifier1();
		ps1.mul();
		access_specifier2 ps2=new access_specifier2();
		ps2.div();
	}

}
