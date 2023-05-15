//35.Sort a map
package com.sortmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortMap {
	static HashMap<Integer, String> m = new HashMap<>();

	public static void sortMapByKey() {
		ArrayList<Integer> sortKeys
        = new ArrayList<Integer>(m.keySet());

    Collections.sort(sortKeys);

    
    for (Integer x : sortKeys)
        System.out.println("Key = " + x
                           + ", Value = " + m.get(x));
}
	 public static void main(String args[])
	    {
	     
	        m.put(7, "seven");
	        m.put(5, "five");
	        m.put(1, "one");
	        m.put(3, "three");
	        m.put(9, "nine");
	 
	       
	        sortMapByKey();
	    }
	}
	


