package com.venki;
/* Write a program to find the factorial of a number using recursion. */
public class Demo 
{
	int factorial(int num) {
		if(num==0)
			return 1;

		else
			return (num* factorial(num-1));
	}
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		System.out.println(d.factorial(9));
		
	}

}
