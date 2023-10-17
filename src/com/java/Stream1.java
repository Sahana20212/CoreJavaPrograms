package com.java;

import java.util.Arrays;
import java.util.List;

public class Stream1 {
	
	public static void main( String args[]) {
		
		//// how to sort a list
		
		List<Integer>  list= Arrays.asList(80,99,15,20,30,88,60);
		
		list.stream().sorted().forEach(System.out::println);
	}

}
