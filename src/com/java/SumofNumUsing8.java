package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SumofNumUsing8 {
	
	public static void main (String args[]) {
		//IntegersumIdid
		List<Integer> list = Arrays.asList(1,4,5,6,7,12,3,4,5,6);
		System.out.println(list.stream().mapToInt(i->i).sum());
		//Integer find min num.
		System.out.println(list.stream().mapToInt(n->n).min().getAsInt());
		////Integer find max num.
		System.out.println(list.stream().mapToInt(n->n).max().getAsInt());
		//print even numbers
		System.out.println(list.stream().filter(n->n%2==0).collect(Collectors.toList()));
		
		
		//Print odd num
		
		System.out.println(list.stream().filter(n->n%2!=0).collect(Collectors.toList()));
		}

}
