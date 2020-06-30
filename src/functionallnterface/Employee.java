package functionallnterface;

/*This class covers
 *  
*/
public class Employee {

	private int employeeId; // instance variable
	private String employeeName;
	private int age;
	private String location;
	// private static ; //class variable
	public static final int ORG_CODE = 108;// constant

	public Employee() {
		System.out.println("Hello---");
	}

	public Employee(int employeeId, String employeeName, int age, String location) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.location = location;
	}
	
	public Employee(int employeeId, String employeeName, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public static void main(String ar[]) {
		System.out.println("Hello from main:");
		Employee employee1 = new Employee();
		//Employee employee = new Employee(121, "SanthoshKumar", 30, "Pune");
		//Employee employee2 = new Employee(121, "Santhosh", 30);
		//employee.printDetails(employee);
	}

	public void printDetails(Employee employee) {
		System.out.print("Employee id:" + employee.getEmployeeId() + "\tEmployee name:" + employee.getEmployeeName()
				+ "\tEmployee age:" + employee.getAge() + "\tEmployee location:" + employee.getLocation());

	}
}
