package com.capgemini.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		
		ArrayList ls1=new ArrayList();
		//Object a[]=new Object[]{new Integer(2)};
		System.out.println(new java.util.Date(new java.util.Date().getTime()));
		Integer a[]=new Integer[]{11,22,33,44,6667,8,8,9,9,90};	
		ls.addAll(Arrays.asList(a));
		System.out.println("Size"+ls.size());
		System.out.println(new java.util.Date(new java.util.Date().getTime()));
		System.out.println("CEnsureapacity");
		ls.ensureCapacity(15);
		
		ls.add(12);
		ls.add("Kolaparthi");
		ls.add("Kolaparthi");
		ls.add(3.5678f);
		ls1.addAll(ls);ls1.addAll(ls);
		System.out.println("After adding Size"+ls.size());
		System.out.println("Elements are "+ls.hashCode());
		System.out.println("Elements are "+ls1);
		Iterator t=ls.iterator();
	//	while(t.hasNext())
			System.out.println("..."+t.next());
			
		
	}

}
