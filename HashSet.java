//77.How to create LinkedHashSet program in java
package com.sortmap;

import java.util.LinkedHashSet;

public class HashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		 
        hs.add("Apple");
        hs.add("Grapes");
        hs.add("Orange");
 
       
        System.out.println("LinkedHashSet : " + hs);
    }

	}


