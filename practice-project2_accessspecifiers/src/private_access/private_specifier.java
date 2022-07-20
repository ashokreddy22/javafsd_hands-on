package private_access;

public class private_specifier {
	private void sub() {
		int a=50,b=30;
		int subtraction=a-b;
		System.out.println("implement private specifier " +subtraction);
	}

	public static void main(String[] args) {
		
		private_specifier  ps=new private_specifier ();
		ps.sub();
	}

}
