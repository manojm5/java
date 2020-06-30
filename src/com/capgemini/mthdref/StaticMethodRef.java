package com.capgemini.mthdref;

import java.util.ArrayList;
import java.util.List;

public class StaticMethodRef {

	public static void main(String a[]) {

		List<String> countryList = new ArrayList<>();
		countryList.add("India");
		countryList.add("Banglore");
		countryList.add("Pune");
		countryList.add("Mumbai");

		// print the list elements in normal way
		System.out.println("<--- Prior to java-8 --->");
		for (String str : countryList) {
			StaticMethodRef.printString(str);
		}

		// In Method Reference way
		System.out.println("\n<--- java-8 method reference way --->");
		countryList.forEach(StaticMethodRef::printString);

		// in Lambda expression way
		System.out.println("\n<--- java-8 lambda expression way --->");
		countryList.forEach(str -> StaticMethodRef.printString(str));
	}

	public static void printString(String str) {
		System.out.println(str);
	}
}