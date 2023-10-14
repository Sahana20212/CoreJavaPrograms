package com.java;

public class S3 {
	
	public static void main (String args []) {
		
		String str="RamaDevi";
		
		String rev="";
		
		for(int i = str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
	}
	
	

}
