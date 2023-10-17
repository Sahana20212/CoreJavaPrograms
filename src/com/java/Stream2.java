package com.java;

import java.util.Arrays;
import java.util.List;

public class Stream2 {

	public static void main (String args[]) {
		
		//How to remove duplicates.
		
		List<Integer>  list= Arrays.asList(20,20,30,30,34,34,88,99,100);
		
		list.stream().distinct().forEach(System.out::println);
	}
}
