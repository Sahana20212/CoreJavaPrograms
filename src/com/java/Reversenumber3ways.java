package com.java;

import java.util.Scanner;

public class Reversenumber3ways {
	
	public static void main( String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter a number:");
		
		int num =sc.nextInt();
		
		//logic1 using alogaritham.
		
		int rev=0;
		
		while (num!=0);
		{
			rev=rev*10+num%10;
			num=num/10;
					
		}
		
		System.out.println("Reverse Number is:"+rev);
	}

}
