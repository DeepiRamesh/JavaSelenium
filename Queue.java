//78.How to create PriorityQueue program in java
package com.method;

import java.util.PriorityQueue;


public class Queue {

	public static void main(String[] args) {
	PriorityQueue<Integer> numbers=new PriorityQueue<>();
	numbers.add(500);
	numbers.add(750);
	numbers.add(900);
	numbers.add(100);	
	while(!numbers.isEmpty()){
	 System.out.println(numbers.remove());
	}
        }

	}


