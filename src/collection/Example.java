package collection;

public class Example {

	private int id;
	private static int n; 
	
	
	public static int getId() {
		System.out.println(n);
		return n;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static void main(String[] args) {
		Example n = new Example();
		System.out.println(n.getId());
		
	}
}
