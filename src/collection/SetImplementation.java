package collection;

import java.util.HashSet;
import java.util.Set;

public class SetImplementation {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		boolean b1 = set.add(66); // true
		boolean b2 = set.add(10); // true
		boolean b3 = set.add(66); // false
		boolean b4 = set.add(8); // true
		
		set.forEach(number->System.out.println(number));
	}
}
