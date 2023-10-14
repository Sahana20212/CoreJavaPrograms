package com.java;

public class Swaptwonumbers {
	
	public static void main (String args[]) {
		
		//Here I will define two variables.
		
		int a =10;//I created 2 differnt variables.
		int b=20;
		
		//After creating two variables i am printing 2 variables lke original values.
		
		System.out.println("Before swapping values are.." +a+"  "+b);
		
		//Now I am appliying the Swapping.
		//Logic 1//here i am using 3rd variable.
		
		
		//Here i am creating temerary variable, t. i assinged to the value for t a.
		int t =a;
		a=b;
		b=t;
		
		//Logic 2 // I am not using any 3 rd variable.here i can use + ,and - operater.With out using 3 rd variable.
		
		a=a+b;//10+20=30,   now 30 assing to the a.
		b=a-b; // currrent a value is 30-,current value of b is 20, 30-20=10.now b value is 10
		a=a-b;//30-10=20
		
		//Logic 3 // Here i am using * , and / operater,dont use 3 rd variable.//here a & b value should not be 0.
		
		a=a*b;//10*20= a value is 200
		b=a/b;//200/20= current value b is 10
		a=a/b;//200/10=20
		
		
		//logic 4 // bitwise XoR operater(^)
		a=a^b;
		b=a^b;
		a=a^b;
		
		//Logic 5  Single statement.
		// a= 10, b=20
		b=a+b-(a=b);
		
		System.out.println("After swapping values are.." +a+"  "+b);
		
	}

}
