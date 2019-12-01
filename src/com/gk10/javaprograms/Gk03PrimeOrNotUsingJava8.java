package com.gk10.javaprograms;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class Gk03PrimeOrNotUsingJava8 {

	public static void main(String[] args) {

		System.out.println("Enter the Value: ");
		Scanner inputFromCmd = new Scanner(System.in);
		int input = inputFromCmd.nextInt();

		IntPredicate isEvenPredicate = iVal -> (iVal % 2 == 0);

		boolean isEvenNumber = isEvenPredicate.test(input);
		if (isEvenNumber) {
			System.out.println("The Given number is even.");
		}

		// This program will give false ans for 0,1,2 input values.
		IntPredicate isOddPredicate = isEvenPredicate.negate();
		boolean isPrime = isOddPredicate.test(input);

		if ((input == 2) || (isPrime && input != 1)) {
			System.out.println("The Given Number is prime");
		}
		System.out.println("End of Program");
		inputFromCmd.close();
	}

}