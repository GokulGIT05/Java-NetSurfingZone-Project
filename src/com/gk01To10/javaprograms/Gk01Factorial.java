package com.gk01To10.javaprograms;

import java.util.Scanner;

public class Gk01Factorial {

	public static void main(String[] args) {

		int fact = 1;

		System.out.println("Enter the input value: ");

		Scanner inVal = new Scanner(System.in);
		int inputVal = inVal.nextInt();

		if (inputVal < 0) {
			System.out.println("Please enter the value above 0.");
		} else {
			// Calculation Done Here. 1 * 2 * 3 * n;
			for (int i = 1; i <= inputVal; i++) {
				fact = fact * i;
			}

			System.out.println("The factorial of " + inputVal + " is " + fact);
		}

		inVal.close();
	}

}
