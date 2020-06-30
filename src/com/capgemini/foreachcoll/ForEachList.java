package com.capgemini.foreachcoll;

import java.util.ArrayList;
import java.util.List;

public class ForEachList {

	public static void main(String a[]) {

		List<String> countryList = new ArrayList<>();
		countryList.add("India");
		countryList.add("USA");
		countryList.add("Japan");
		countryList.add("Canada");

		// iterate through List normal way
		ForEachList.iterateList(countryList);

		// iterate through List using forEach method
		ForEachList.iterateListUsingForEach(countryList);
	}

	public static void iterateList(List<String> countryList) {

		System.out.println("<-----Iterating in normal way----->");
		for (String country : countryList) {
			System.out.println(country);
		}
	}

	public static void iterateListUsingForEach(List<String> countryList) {

		System.out.println("\n<---Iterating using forEach method--->");
		countryList.forEach(country -> System.out.println(country));

		countryList.forEach(country -> {
			// you can implement some business logic here..
			if(country.contains("India")) {
				System.out.println("Hello India");
				
			}
		});
	}
}