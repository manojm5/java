package com.capgemini.Dates;

import java.time.LocalDate;
//Compare Dates.
public class CompareDates {

	public static void main(String[] args) {

		LocalDate dtObj1 = LocalDate.of(2015, 12, 15);
		LocalDate dtObj2 = LocalDate.of(2018, 10, 1);

		System.out.println("First date: " + dtObj1);
		System.out.println("Second date: " + dtObj2);

		boolean result = dtObj1.isAfter(dtObj2);
		System.out.println("is first date after second date?: " + 
		result);

		result = dtObj2.isAfter(dtObj1);
		System.out.println("is second date after first date?: " + 
		result);

		result = dtObj1.isBefore(dtObj2);
		System.out.println("is first date before second date?: " + 
		result);

		// you can use equals method on date objects
		result = dtObj1.isEqual(dtObj2);
		System.out.println("is first date equals to second date?: " +
		result);

		// compare two dates with comareTo method
		if (dtObj1.compareTo(dtObj2) > 0) {
			System.out.println("first date is after second date");
		} else if (dtObj1.compareTo(dtObj2) < 0) {
			System.out.println("first date is before second date");
		} else if (dtObj1.compareTo(dtObj2) == 0) {
			System.out.println("first date is equals to second date");
		}
	}
}