package strings;

public class string_operations {

	public static void main(String[] args) {
		String name = "ASHOK REDDY";
		String
		s2 = new String("kumar");
		System.out.println(name);
		System.out.println(s2);
		System.out.println(name.length());
		System.out.println(name.indexOf('D'));
		System.out.println(name.charAt(8));
		System.out.println(name.substring(6));
		System.out.println(name + s2);
		System.out.println(name.substring(3, 8));
		String[] n = name.split(" ");
		System.out.println(n[1]);
		System.out.println(name.replace("K","R"));
		System.out.println(name.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println("\n");
		System.out.println("string buffer ");
		StringBuffer s3=new StringBuffer("Welcome to India ");
		s3.append("from America");
		System.out.println(s3);
		s3.replace(11, 16,"london" );
		System.out.println(s3);
		System.out.println("\n");
		System.out.println("string builder");
		StringBuilder s5=new StringBuilder("knowing java ");
		System.out.println(s5.append("programs"));
		System.out.println(s5.insert(1,"welcome"));
		System.out.println(s5.reverse());
		System.out.println("\n");
		System.out.println("conversions");
		String s="driving the vehicle ";
		StringBuffer s6 =new StringBuffer(s);
		s6.append("in the road");
		System.out.println("String to stringbuffer");
		System.out.println(s6);
		StringBuilder s7 =new StringBuilder(s);
		s7.append("in the water");
		System.out.println("String to stringbuilder");
		System.out.println(s7);
		
				
		
	
	}

}
