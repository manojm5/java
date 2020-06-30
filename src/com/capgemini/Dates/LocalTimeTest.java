package com.capgemini.Dates;

import java.time.LocalTime;

public class LocalTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime tim = LocalTime.now();
		System.out.println(tim.getHour());
		System.out.println(tim.getMinute());
		System.out.println(tim.getSecond());
		System.out.println(tim.getHour() + ":" + tim.getMinute() +
				":" + tim.getSecond());
	}

}
