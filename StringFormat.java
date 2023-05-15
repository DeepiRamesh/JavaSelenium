//2.Reverse a string
package com.string;

public class StringFormat {

public static void main(String[] args) {
   System.out.println(StringFormat.reverseString("My Name is Deepika"));
   System.out.println(StringFormat.reverseString("I am Gokul Karthi"));
	}

public
static String reverseString(String str) {
	
	StringBuilder sb=new StringBuilder(str);
	sb.reverse();
	
	return sb.toString();
}

	}


