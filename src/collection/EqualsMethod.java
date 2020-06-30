package collection;

public class EqualsMethod {
	
	public static void main(String[] args) {
		EqualsMethod equalsMethod = new EqualsMethod();
		EqualsMethod equalsMethod1 = new EqualsMethod();
		EqualsMethod equalsMethod2 = equalsMethod;
		String s1= "Bob";
		String s2="Bob";
		String s3= "bob";
		System.out.println(equalsMethod.equals(equalsMethod1));
		System.out.println(equalsMethod.equals(equalsMethod2));
		//System.out.println(equalsMethod==equalsMethod2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
