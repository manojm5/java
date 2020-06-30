package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapExample {
public static void main(String[] args) {
	BiFunction<String, String, String> mapper = (v1, v2)->v1.length()>v2.length()?v1:v2;
	Map<String, String> map = new HashMap<>();
	map.put("101", "selvi");
	map.put("102","abc");
	map.putIfAbsent("103", "iniyan");
	map.merge("103","santhoshkumar" , mapper);
	map.forEach((k,v)->System.out.println("Key:"+k+"\tvalue:"+v));
}
	}

