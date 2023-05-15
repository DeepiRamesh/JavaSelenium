//27.Write java
package com.readandwrire;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		try {
			 FileWriter fw = new FileWriter("gfg.txt");
			 
		
			 fw.write("We love GeeksForGeeks");
			 fw.close();
			 System.out.println("\nFile write done");
        
		}
		  catch (IOException e) {
			  System.out.println("There are some IOException");
		        }
	}

}
