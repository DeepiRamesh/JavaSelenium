//20.NullPointException
package com.nullvalue;

public class NullPointException {

	public static void main(String[] args) {
		 String ptr = null;
		 
	        
	       try
	        {
	        
	            if (ptr.equals("NullPointException"))
	                System.out.print("Same");
	            else
	                System.out.print("Not Same");
	        }
	        catch(NullPointerException e)
	        {
	            System.out.print("NullPointerException Caught");
	        }

	}

}
