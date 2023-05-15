//26.Write a Java Program to print the below output: * 1 * 12 * 123 * 1234 * 12345 * 123456 * 1234567

package com.method;

public class Print
{
    public static void main(String [] args){
    	 for (int i = 1; i <= 7; i++) {
             for (int j = 6; j >= i; j--)
                 System.out.print(" ");
             for (int k = 1; k <= i; k++)
                 System.out.print(k);
             System.out.println();
         }
    }
}


