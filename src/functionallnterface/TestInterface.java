package functionallnterface;

public interface TestInterface {
	int MIN_SIZE = 1; // default public, static and final.
	public static final int MAX_SIZE = 10; //

	default void newMethod() {
		System.out.println("Newly added default method in TestInterface");
	}

	void existingMethod(String str); // public and abstract

	static void anotherNewMethod() {
		System.out.println("Newly added static method");
	}
}
