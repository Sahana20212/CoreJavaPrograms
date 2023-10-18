package com.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream1 {
	
	public static void main( String args[]) {
		
		//// how to sort a list
		
		
		List<Integer>intlist=Arrays.asList(5,1,0,2,9,10,20);
		
		intlist.stream().sorted().forEach(System.out::println);
		System.out.println("reverse order");
		intlist.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

}}
