package com.capgemini.util;

import java.util.*;

public class SetDupli {
	public static void main(String[] args) {
		ArrayList ls = new ArrayList();
		ls.add(1);
		ls.add('a');
		ls.add("srini");
		ls.add(3.45f);
		TreeSet s = new TreeSet();
		s.add("33");
		s.add("\n");
		s.add("\t");
		s.add("33");
		
		 
		 Iterator r=s.descendingIterator();
		 while(r.hasNext())
		System.out.println(r.next());
		 		 
		 NavigableSet ss=s.descendingSet();
			System.out.println(ss);		 
	}
}
