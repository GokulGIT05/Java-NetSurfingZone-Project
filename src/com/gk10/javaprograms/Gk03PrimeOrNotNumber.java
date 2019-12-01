package com.gk10.javaprograms;

import java.util.Scanner;

public class Gk03PrimeOrNotNumber {

	// Here are the first few prime numbers: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31
	public static void main(String[] args) {

		int isValCheck = 0;
		System.out.println("Enter the Number: ");
		Scanner scanInput = new Scanner(System.in);
		int inputVal = scanInput.nextInt();

		// 1. Loop is mainly for checking the value = 2. Because 2 is an prime number
		for (int i = 2; i <= (inputVal / 2); i++) {

			// Below Condition is mainly will run
			if (inputVal % i == 0) {
				// The Given number is even.
				isValCheck++;
				break;
			}
		}

		// 2. Check for Both 0 and 1.
		if ((isValCheck == 0) && (inputVal != 1) && (inputVal != 0)) {
			System.out.println("The Given Number is Prime");
		} else {
			System.out.println("Not Prime");
		}
		
		scanInput.close();

	}

}
