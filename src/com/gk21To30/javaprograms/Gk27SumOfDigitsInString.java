package com.gk21To30.javaprograms;

public class Gk27SumOfDigitsInString {

	public static void main(String[] args) {

		String str = "123abcZ";

		int sumOfStr = 0;

		// It will sum only the digits in the String.
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sumOfStr = sumOfStr + Character.getNumericValue(str.charAt(i));
			}
		}

		System.out.println("The Sum of String are: " + sumOfStr);

	}

}
