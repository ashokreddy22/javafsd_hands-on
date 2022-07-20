package demo_method;

public class call_value {
	int a=10;
	int mul(int a) {
		a=a*10;
		return a;
	}

	public static void main(String[] args) {
call_value cv=new call_value();
System.out.println("before operation value is "+ cv.a);
cv.mul(20);
System.out.println("after operation value is "+ cv.a);
	}

}
