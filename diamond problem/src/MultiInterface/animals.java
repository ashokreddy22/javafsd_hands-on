package MultiInterface;

public class animals implements dog,cat{
	public void eat() {
		dog.super.eat();
		cat.super.eat();
	}

	public static void main(String[] args) {
		animals a=new animals();
		a.eat();

	}

}
