package com.java;

import java.util.Arrays;
import java.util.List;

public class Streamspracting {
	
	public static void main (String args[]) {
		//Integers sum.
		List<Integer>intlist=Arrays.asList(55,25,99,30,99);
		
		System.out.println(intlist.stream().mapToInt(n->n).sum());
		
		//Find min value for integer.
		
		System.out.println(intlist.stream().mapToInt(n->n).min().getAsInt());
		
////Find max value for integer.
		System.out.println(intlist.stream().mapToInt(n->n).max().getAsInt());
		
}}
