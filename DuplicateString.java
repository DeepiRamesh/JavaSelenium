//3.Duplicate characters in a string
package com.string;

public class DuplicateString {

	public static void main(String[] args) {
   String str="beautiful girl";
   char[]carray=str.toCharArray();
   System.out.println("The String is:"+ str);
   System.out.println("Duplicate Charactersin above are");
   for (int i=0; i<str.length();i++) {
	for (int j= i+1; j<str.length(); j++) {
		if (carray[i]==carray[j]) {
			System.out.println(carray[j]+"");
			break;
		}
	}
	   
   }
	}

}
