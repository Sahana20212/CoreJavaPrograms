package com.java;

import java.util.Arrays;
import java.util.List;

public class Streams {
	
	public static void main (String args[]) {
		
		List<Integer> list =Arrays.asList(10,20,30,40,50);
		
		System.out.println(list.stream().mapToInt(n->n).sum());
		
		System.out.println(list.stream().mapToInt(n->n).min().getAsInt());

		System.out.println(list.stream().mapToInt(n->n).max().getAsInt());
	}

}
