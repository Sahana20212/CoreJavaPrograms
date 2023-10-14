package com.java;

import java.util.Arrays;
import java.util.List;

public class SumofNumUsing8 {
	
	public static void main (String args[]) {
		
		List<Integer> list = Arrays.asList(1,4,5,6,7,12,3,4,5,6);
		System.out.println(list.stream().mapToInt(i->i).sum());
	}

}
