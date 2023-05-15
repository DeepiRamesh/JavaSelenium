//4.Remove duplicates in ArrayList 
package com.array;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {
	
	List<String> l = new ArrayList<String>();
	l.add("Tomato");
	l.add("Potato");
	l.add("Tomato");
	l.add("Carrot");
System.out.println(l.toString());
Set<String>s= new LinkedHashSet<String>(l);
System.out.println(s);
	}

}
