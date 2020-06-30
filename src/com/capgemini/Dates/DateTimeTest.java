package com.capgemini.Dates;

import java.time.LocalDateTime;

public class DateTimeTest {

	public static void main(String[] args) {
		
		LocalDateTime tim= LocalDateTime.now();
		System.out.println("========Date Time ===========");
		System.out.println(tim);
		System.out.println("Day Year"+tim.getDayOfYear());
		System.out.println("Hour"+tim.getHour());
		System.out.println("In nano Seconds"+tim.getNano());
		System.out.println("========END==========");
		
		
	}

}
