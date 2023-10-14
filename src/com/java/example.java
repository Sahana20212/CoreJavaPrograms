package com.java;

import java.util.Arrays;
import java.util.List;

public class example {
	
	public static void main (String args[]) {
		
		List<Integer> list1= Arrays.asList(12,38,98,100,88,77,66,55);
		
		 System.out.println(list1.stream().mapToInt(n->n).sum());
		
System.out.println(list1.stream().mapToInt(n->n).min().getAsInt());

System.out.println(list1.stream().mapToInt(n->n).max().getAsInt());
	}

}
