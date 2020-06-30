package collection;

import java.util.function.Consumer;

//You use a Consumer when you want to do something with a parameter but not return anything.
public class ConsumerExample {
	public static void main(String[] args) {

		Consumer<String> consumer = ConsumerExample::printCountry;
		consumer.accept("India");
		consumer.accept("Norway");
	}
	
	private static void printCountry(String name) {       
        System.out.println(name);
    }
}
