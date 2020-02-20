package com.venki;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

	public static void main(String[] args) {
		Date now=new Date();
		System.out.println(now);
		SimpleDateFormat ft=new SimpleDateFormat("E dd MMM yyyy 'at' hh:mm:ss a zzz");
		System.out.println(ft.format(now));
		ft=new SimpleDateFormat("dd.mm.yyyy");
		//Date d=new Date();
		System.out.println(ft.format(now));
	}

}
