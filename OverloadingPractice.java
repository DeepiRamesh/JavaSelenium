//7.overloading  by changing a no of arguments
package com.overloading;

public class OverloadingPractice {

	public static void display(int a) {
		System.out.println("Arguments:"+a);
	}
    public static void display(int a,int b){
    	System.out.println("Arguments:"+a+"and"+b);
    }
    public static void main(String[]args) {
    	display(1);
    	display(1,4);
    }
}

