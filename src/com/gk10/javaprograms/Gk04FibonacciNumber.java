package com.gk10.javaprograms;

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
			System.out.println(fibNo);
		}
		scanInput.close();
	}

	private static int normalWay(int i) {

		if (i == 1 || i == 2) {
			return 1;
		}

		int fbNo = 0;
		int prevIndex = 1;
		int prevMinus1Index = 1;
		
		// 3 Index, we are using swap Funtion here,
		for (int index = 1; index <= 3; index++) {
			fbNo = prevIndex + prevMinus1Index;
			prevIndex = prevMinus1Index;
			prevMinus1Index = fbNo;
		}
		return fbNo;
	}

}
