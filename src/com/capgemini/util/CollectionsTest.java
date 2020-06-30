package com.capgemini.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class CollectionsTest {

	public static void main(String[] args) {
		//ArrayList ls = new ArrayList();
		Vector ls = new Vector();
		for (int i = 890; i <= 1050; i++)
		ls.add(i);
		Iterator r = ls.iterator();
		while (r.hasNext()) {
			System.out.println(r.next());
		}

	}

}
