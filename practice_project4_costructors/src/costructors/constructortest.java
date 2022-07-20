package costructors;

public class constructortest {
	int a,b;
	constructortest(){   //default constructor
		System.out.println("default constructor");
	}
	constructortest(int x,int y){
		this.a=x;
		this.b=y;
		
	}
	public void operations() {
		System.out.println("paramerized constructor");
		System.out.println("addition "+a+b);
		System.out.println("multiplication "+ a*b);
		
	}

	public static void main(String[] args) {
		constructortest co=new constructortest();
		constructortest co1=new constructortest(10,20);
		co1.operations();
	}

}
