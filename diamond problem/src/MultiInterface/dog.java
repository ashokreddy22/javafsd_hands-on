package MultiInterface;

public interface  dog {
	default void eat() {
	System.out.println("dog is eating");
	}
}
