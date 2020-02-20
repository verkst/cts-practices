package com.venki;

public class ExceptionEx2 {
	static String s;
	public static void main(String[] args) {
		try {
		System.out.println(s.length());
		}
		catch(NullPointerException npe) {
		System.out.println("Null Pointer Exception");
		}
		System.out.println("After Exception");
		
		System.err.println("Venkateswarlu");
		
	}

}
