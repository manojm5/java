package functionallnterface;

public class Manager extends Employee {

	private String depart;
	
/*	static {
		System.out.println("Inside static");
	}
	
	{
		System.out.println("inside init");
	}*/

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	static Manager managerInstance = null;

	public Manager() {
		System.out.println("Default");
	}

	public Manager(int employeeId, String employeeName, int age, String location, String department) {
		super(employeeId, employeeName, age, location);
		this.depart = department;
		System.out.println("Parameterized");
	}

	static public Manager getInstance() {
		if (managerInstance == null)
			managerInstance = new Manager();
		return managerInstance;
	}

	public static void main(String[] args) {
		Manager m  = new Manager();
		Manager manager = new Manager(102, "John", 30, "pune", "coe");
		manager.printDetails(manager);
	}

	public void printDetails(Manager manager) {
		super.printDetails(manager);
			System.out.println("\tDepartment:" + manager.getDepart());
	}
}


