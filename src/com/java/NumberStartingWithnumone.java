package com.java;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithnumone {
	
	public static void main (String args[]) {
		
		List<Integer> list =Arrays.asList(10,15,20,40,80,30,80,90);
		
		
	list.stream().map(s->s+"")//Convert integer to string.
	
	.filter(s->s.startsWith("1"))
	.forEach(System.out::println);
	
	}
	

}
