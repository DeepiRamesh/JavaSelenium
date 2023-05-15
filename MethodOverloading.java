//8.method overloading by changing a no of arguments
package com.overloading;

import java.beans.Statement;

class MethodOverloading {

	  public void student_name(String name) {
		System.out.println(name);
	  }
   public static void student_name(int num) {
	   System.out.println(num);
   }
	public static void student_name(boolean a) {
		System.out.println(a);
	}
	public static void student_name(char a) {
		System.out.println(a);
	}
    public static void student_name(float b) {
    	System.out.println(b);
    }
	public static void main(String[] args) {
		MethodOverloading ml = new MethodOverloading();
		ml.student_name("Deepika");
		ml.student_name(10);
        ml.student_name(true);	
	    ml.student_name("S");
        ml.student_name(5.14f);	
	}

}


