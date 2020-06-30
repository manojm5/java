package functionallnterface;

public class Example implements TestInterface, DemoInterface {

	

	static void anotherNewMethod() {
		System.out.println("Newly added static method in class");
	}

	public void newMethod() {
		System.out.println("Implementation of default method in class");
	}

	public static void main(String[] args) {
		Example obj = new Example();
		// calling the default method of interface
		obj.newMethod();
		// calling the abstract method of interface
		obj.existingMethod("Java 8 is easy to learn");
		Example.anotherNewMethod();
	}

	@Override
	public void existingMethod(String str) {
		System.out.println(str);
	}

}
