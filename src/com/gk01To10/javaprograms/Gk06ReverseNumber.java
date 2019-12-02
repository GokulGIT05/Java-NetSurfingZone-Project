package com.gk01To10.javaprograms;

public class Gk06ReverseNumber {

	public static void main(String[] args) {

		System.out.println("Divide: " + 255 / 10);
		System.out.println("Modulus: " + 255 % 10);

		int inputNumber = 1234;
		System.out.println("Input Number: " + inputNumber);

		int reverseNumber = 0;
		while (inputNumber != 0) {
			reverseNumber = reverseNumber * 10;
			reverseNumber = reverseNumber + (inputNumber % 10);
			inputNumber = inputNumber / 10;
		}

		System.out.println("Reversed Number: " + reverseNumber);

	}

}
