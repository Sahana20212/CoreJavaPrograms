package com.java;

import java.util.Arrays;
import java.util.List;

public class Rama1 {
	
	public static void main (String args[]) {
		
		//Print Sum Using Java8?
		
		List<Integer> intlist = Arrays.asList(22,22,8,9,9,8,29,89,10,11);
		
		System.out.println("sum of number :"+ intlist.stream().mapToInt(n->n).sum());
		
		//Print Min Number using Java8?.
		
		System.out.println("minimum number" +intlist.stream().mapToInt(n->n).min().getAsInt());
		
		System.out.println("maxium number" +intlist.stream().mapToInt(n->n).max().getAsInt());
		System.out.println("distinct number");
		
		intlist.stream().distinct().forEach(System.out::println);
		
		System.out.println("Even numbers");
		
		intlist.stream().filter(n->n%2==0).forEach(System.out::println);
		
		System.out.println("Distinct Even numbers");
		intlist.stream().distinct().filter(n->n%2==0).forEach(System.out::println);
		
		System.out.println("odd numbers");
		
		intlist.stream().filter(n->n%2!=0).forEach(System.out::println);
		
		System.out.println("Distinct odd num");
		
		intlist.stream().distinct().filter(n->n%2!=0).forEach(System.out::println);
		
		System.out.println("Display Numbers start with 1");
		
		intlist.stream()
				  .map(s->s + "")  //convert interger to string
					 .filter(s->s.startsWith("1"))
					   .forEach(System.out::println);
		
		
	}

}
