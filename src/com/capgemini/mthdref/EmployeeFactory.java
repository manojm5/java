package com.capgemini.mthdref;

@FunctionalInterface
public interface EmployeeFactory {
	 
    public abstract Employee getEmployee(String name, String account, Integer salary);
}