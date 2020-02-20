package com.venki;

public class ExceptionEx1 {

	public static void main(String[] args) {
		int num=10,a=0;
		int ai[]=new int[2];
		ai[0]=100;
		try {
			try {
				System.out.println(ai[7]);
			}
			catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("ArrayIndexOutOfBounds reached");
			}

			System.out.println(num/a);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Error");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("After Exception");
		
	}

}