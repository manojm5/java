package collection;

import java.util.*;
import java.util.ArrayList;
import java.util.function.Predicate;

//Predicate is often used when filtering or matching. 
public class PredicateExample {

	public static void main(String[] args) {
		Predicate<String> containsPredicate = (name) -> name.startsWith("E") && name.contains("y");
		//System.out.println(containsPredicate.test("Norway"));
		
		  List<String> countryList = new ArrayList<String>(); 
		  countryList.add("India");
		  countryList.add("Canada"); 
		  countryList.add("Norway");
		  countryList.add("Egypt");
		  countryList.stream().filter(name->name.startsWith("I")).forEach(System.out::println);
		  countryList.stream().filter(containsPredicate).forEach(System.out::println);
		 // countryList.stream().filter()
		 
	}
}
