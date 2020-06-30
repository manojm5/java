package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
	public static void main(String[] args) {
		Function<String, Integer> func = x -> x.length();
		Function<Integer, Integer> func2 = x -> x * 2;

		Integer apply = func.andThen(func2).apply("HelloPeople"); 
		//System.out.println(apply);

		List<String> countryList = new ArrayList<String>();
		countryList.add("India");
		countryList.add("Canada");
		countryList.add("Norway");
		countryList.add("Egypt");
		System.out.println(countryList.stream().map(func).collect(Collectors.toList()));
	}

}
