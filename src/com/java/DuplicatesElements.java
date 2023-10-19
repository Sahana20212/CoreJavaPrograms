package com.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//How to find duplicate elements in a given integers list in java using Stream functions?


public class DuplicatesElements {
	
	public static void main (String args[]) {
		
		List<Integer> intList =Arrays.asList(10,10,99,99,100,90,90);
		Set <Integer> set= new HashSet<Integer>();
		intList.stream()
					.filter(n->!set.add(n))
						.forEach(System.out::println);
					
	}

}
