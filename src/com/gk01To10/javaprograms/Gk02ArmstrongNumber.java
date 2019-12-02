package com.gk01To10.javaprograms;

import java.util.Scanner;

public class Gk02ArmstrongNumber {

	// Armstrong number is a number that is equal to the sum of cubes of its digits.
	// For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
	public static void main(String[] args) {

		int finalValueToTest = 0;
		System.out.println("Enter the number: ");
		Scanner scanVal = new Scanner(System.in);
		int inputVal = scanVal.nextInt();
		int tempVal = 0;
		tempVal = inputVal;
		int firstDigit = 0;
		
		// Looping Starts
		while (tempVal != 0) {
			firstDigit = tempVal % 10;
			finalValueToTest = finalValueToTest + (firstDigit * firstDigit * firstDigit);
			tempVal = tempVal / 10;
		}

		if (finalValueToTest == inputVal) {
			System.out.println("The Given Number is armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
		
		scanVal.close();

	}

}
