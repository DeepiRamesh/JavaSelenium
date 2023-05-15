//15.Remove special characters in java
package com.string;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		  
	String str= "I#have%a^beautiful*eyes&.";
	
	str = str.replaceAll("[^a-zA-Z0-9]", " ");
	
	System.out.println(str);  
			}  

	}


