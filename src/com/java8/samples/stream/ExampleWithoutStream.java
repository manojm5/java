package com.java8.samples.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExampleWithoutStream {
	
	public static void main(String[] args) {    
		List<String> names = new ArrayList<String>();
		names.add("Iniyan");
		names.add("Santhosh");
		
		List<String> lName = new ArrayList<>();
		lName.add("Venugopal");
		lName.add("Santhosh");
		long count = 0;
		/*for (String str : names) {
		   if (str.length() < 6) 
			count++; 
		}*/
	         count = names.stream().filter(str->str.length()<6).count();
	         System.out.println("There are "+count+" strings with length less than 6");
	         Stream<String> optStream = Stream.concat(names.stream(),lName.stream());
	         optStream.forEach(str->System.out.println(str+""));
	   } 
	}

