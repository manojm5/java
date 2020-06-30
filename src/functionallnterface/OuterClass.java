package functionallnterface;

public class OuterClass {
	
	public void printMessage() { 
		System.out.println("Outer class");
	}
	static class StaticNestedClass{
		int count=2;
		
	public void printMessage() {
		System.out.println("Inside Nested class");
	}
	
	}

}
