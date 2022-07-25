package MultiInterface;

public interface cat {
 default void eat() {
	System.out.println("cat is eating");
}
}
