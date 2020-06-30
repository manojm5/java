package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * 
List a =  new Stack();
List b =  new Vector();
List c =  new ArrayList();
List d = new LinkedList();
 */
public class ListImplementation {

	public static List<Integer> indexBasedAccess() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0, 1);
		list.add(1, 3);
		list.add(2, 5);
		list.add(3, 7);
		System.out.println(list);
		list.remove(3);
		System.out.println(list.get(2));
		list.set(1, 7);
		System.out.println(list);
		//list.forEach(elements->System.out.println(elements));
		//System.out.println(list.subList(0, 2));
		return list;
	}

	public static List<String> search() {

		List<String> list = new ArrayList<String>();
		list.add("Search");
		list.add("Java");
		System.out.println(list.indexOf("Java"));
		return list;
	}

	public static void useLiterator() {
		List<String> list = new ArrayList<String>();
		list.add("Search");
		list.add("Java");
		ListIterator<String> li = list.listIterator();
		
		while (li.hasNext()) {
			System.out.println("index=" + li.nextIndex() + "value=" + li.next());
		}
		System.out.println("backward iteration");
		while (li.hasPrevious()) {
			System.out.println("index= " + li.previousIndex() + "value=" + li.previous());
		}
	}


	public static void main(String[] args) {
		indexBasedAccess();
		search();

	}
}
