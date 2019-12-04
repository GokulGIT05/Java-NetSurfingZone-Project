package com.gk11To20.javaprograms;

public class Gk13SwapTwoNumber {
	// Program for swapping of two number without using third variable in java
	public static void main(String[] args) {

		int number1 = 25, number2 = 52;

		System.out.println("Before Swap: ");
		System.out.println("number1: " + number1);
		System.out.println("number2: " + number2);
		
		number1 = number1 * number2;
		number2 = number1 / number2;
		number1 = number1 / number2;

		System.out.println();
		System.out.println("After Swap");
		System.out.println("number1: " + number1);
		System.out.println("number2: " + number2);

	}

}
