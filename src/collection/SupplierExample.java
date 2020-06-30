package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

//A Supplier is used when you want to generate or supply values without taking any input.
public class SupplierExample {
	public static void main(String[] args) {

		Supplier<String> message = () -> "Hello";
		//System.out.println(message.get());
		
		List<String> countryList = new ArrayList<String>();
		countryList.add("India");
		countryList.add("Canada");
		countryList.add("Norway");
		countryList.add("Egypt");
		countryList.stream().forEach((name)->{
			printCountry(()->name);
		});
	}
	
	private static void printCountry(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }
}
