package com.gk31To40.javaprograms;

import java.time.LocalDateTime;
import java.time.Year;

public class Gk34LeapYearOrNot {

	public static void main(String[] args) {
		int year = 2020;

		if (year % 4 == 0) {
			System.out.println("The Given Year is Leap Year");
		} else
			System.out.println("The Given Year is Not Leap Year");

		System.out.println("******************************************");

		// Java 8 Approach
		// LocalDateTime dateObj = LocalDateTime.now();
		LocalDateTime dateObj = LocalDateTime.of(2020, 02, 2, 06, 00);

		int yearFromServerTime = dateObj.getYear();
		System.out.println(yearFromServerTime);

		// Year.isLeap
		boolean isLeap = Year.isLeap(yearFromServerTime);

		if (isLeap) {
			System.out.println("The Given Year is Leap Year");
		} else {
			System.out.println("The Given Year is Not Leap Year");
		}

	}

}
