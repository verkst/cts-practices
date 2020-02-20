package com.venki;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getDate());
		System.out.println(d.getDay());
		System.out.println(d.getMonth()+1);
		System.out.println(d.getTime());
	}

}
