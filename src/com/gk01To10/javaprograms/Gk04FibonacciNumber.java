package com.gk01To10.javaprograms;

import java.util.Scanner;

public class Gk04FibonacciNumber {

	// a series of numbers in which each number ( Fibonacci number ) is the sum of
	// the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.
	public static void main(String[] args) {

		System.out.println("Enter the number: ");
		Scanner scanInput = new Scanner(System.in);
		int inputValue = scanInput.nextInt();
		System.out.println("The Number Enter is: " + inputValue);

		System.out.println("The Fibonacci Numbers are: ");
		// need to loop till the entered Value.
		for (int i = 1; i <= inputValue; i++) {
			 int fibNo = normalWay(i);
		//	int fibNo = recursiveWay(i);
			System.out.println(fibNo);
		}

		scanInput.close();
	}

	private static int normalWay(int input) {

		if (input == 1 || input == 2) {
			return 1;
		}

		
		int first = 1;
		int second = 1;
		int fbNo = 1; // It can be 0 or 1.
		
		// 3 Index, we are using swap Function here,
		for (int index = 3; index <= input; index++) {
			fbNo = first + second;
			first = second;
			second = fbNo;
		}
		return fbNo;
	}

	// Am not getting how below works, so leave it.
	private static int recursiveWay(int input) {

		if (input == 1 || input == 2) {
			System.out.println("inside: " + input);
			return 1;
		}
		System.out.println("Outside " + input);
		int first = recursiveWay(input - 1);
		
		System.out.println("End of First: " + first);
		int Second = recursiveWay(input - 2);
		System.out.println("End of Second: " + Second);
		return first + Second;
	}

}
