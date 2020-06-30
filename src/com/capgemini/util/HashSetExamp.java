package com.capgemini.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExamp {

	public static void main(String[] args) {
		HashSet s=new HashSet();
		s.add(12);
		s.add(345);
		s.add(678);
		//s.add(null);
		s.add(678);
		HashSet ls=new HashSet();
		ls.add(12);
		ls.add(345);
		ls.add(678);
		//s.add(null);
		ls.add(6781);
		 if(s.containsAll(ls))
	        {
	        	System.out.println("Equal");
	        }
	        else
	        {
	        	System.out.println("Not Equal");
	        }
		/*Iterator rr=s.iterator();
		while(rr.hasNext())
		{
			rr.remove();
		System.out.println(rr.next());
		
		}
		System.out.println(s);*/
	}

}
