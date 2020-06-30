package com.java8.samples.stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExmp {

	public static void main(String a[]) {

		List<String> vehicles = Arrays.asList("igate", "car", "liquidhub", "iniyan", "capge");

		vehicles.parallelStream().filter(str -> str.length() > 3).map(String::toUpperCase).sorted()
				.forEach(System.out::println);
		;
	}
}