package functionallnterface;

//An interface may also include constant public static final variables, default methods, and tatic methods.
public interface DemoInterface {
	
	default void newMethod() {
		System.out.println("Newly added default method in demo");
	}

	
	void existingMethod(String str);
	
	static void display() {
		System.out.println("Static method");
	}
}
