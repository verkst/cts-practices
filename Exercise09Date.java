package com.venki;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise09Date {
	public static void main(String[] args) {
		//Year y=Year.of(1998);
		//Month m=Month.of(06);
		LocalDate date=LocalDate.now();
		System.out.println("Venkateswarlu Velpula");
		System.out.println("Date of Birth = "+date.minusDays(7902).format(DateTimeFormatter.ofPattern("dd:MMMM:uuuu")));
	}

}
