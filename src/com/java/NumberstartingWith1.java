package com.java;

import java.util.Arrays;
import java.util.List;

public class NumberstartingWith1 {
	
	public static void main (String args[]) {
		
		List<Integer> list=Arrays.asList(10,15,20,90,80,90,80);
		
		list.stream()
		.map(s-> s + "")
		.filter(s-> s.startsWith("1"))
		.forEach(System.out::println);
	}

}
