package newfeatures.lambda;
import java.util.*; 

public class LambdaInCollection {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("banana");
		fruits.forEach((fruit)->System.out.println(fruit));
	}

}

