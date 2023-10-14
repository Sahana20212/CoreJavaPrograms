package com.java;

public class Swap2 {
	public static void main (String args[]) {
		
		int a=30;
		int b=50;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
	}

}
