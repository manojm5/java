package com.capgemini.mthdref;

public class MyExampComparator {
	 
    public int compare(Employee emp1, Employee emp2) {
 
        return emp1.getSalary().compareTo(emp2.getSalary());
    }
}