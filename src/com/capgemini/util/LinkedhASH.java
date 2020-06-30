package com.capgemini.util;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedhASH {

	public static void main(String[] args) {
		LinkedHashSet ss = new LinkedHashSet();
		ss.add(34);
		ss.add(585);
		LinkedHashSet ss1 = new LinkedHashSet();
		ArrayList ls = new ArrayList();
		ls.add(34);
		ls.add(586);
		ls.add(34);
		ls.add(585);
		ss1.add(34);
		ss1.add(55);
		boolean bob = ss.containsAll(ls);
		if (bob) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}

}
