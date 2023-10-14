package com.java;

public class S4 {
	
	public static void main (String args[]) {
		
		String str="VenkatSubbareddy";
		int mid=(str.length())/2;
	String half="";
	
	for(int i=0;i<=mid-1;i++ ) {
		 half=half+str.charAt(i);
		
	}
	System.out.println(half);
	}

}
