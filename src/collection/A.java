package collection;

public class A {

	void display() {
	}
	public static void main(String[] args) {
		A a = new B();
		a.display();
	}
}

class B extends A {

	void display() {
		System.out.println("B");
	}

	

}
