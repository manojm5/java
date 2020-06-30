package com.capgemini.mthdref;

import java.util.function.Function;

public class ConstructorRef {

	public static void main(String a[]) {

		EmployeeFactory empFactory = Employee::new;
		Employee emp = empFactory.getEmployee("Selvi", "Accounts", 8000);
		System.out.println(emp);
		
	}
}
	class Test{
		
		int a;

		public Test(int a) {
			super();
			this.a = a;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}
		
	public static void main(String[] args) {
		//Test t = new Test(1);
		Function<Integer,Test> function = Test::new;
		Test t = function.apply(1);
		System.out.println(t.getA());
	}
}