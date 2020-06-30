package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;
	private String address;

	public Employee(int empId, String empName, String address) {
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return empName.compareTo(o.empName);
	}
	
	public static void main(String[] args) {
		List<Employee> empl = new ArrayList<>();
		empl.add(new Employee(101, "selvi", "pune"));
		empl.add(new Employee(102, "Diwesh", "norway"));
		Collections.sort(empl);
		System.out.println(empl);
	}

}
