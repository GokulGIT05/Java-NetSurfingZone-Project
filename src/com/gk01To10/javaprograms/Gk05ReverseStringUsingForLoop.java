package com.gk01To10.javaprograms;

public class Gk05ReverseStringUsingForLoop {

	public static void main(String[] args) {

		String inputString = "Hi Hello How Are You";
		System.out.println("Input String: " + inputString);

		String reversedString = reverseString(inputString);

		System.out.println(reversedString);

	}

	private static String reverseString(String inputString) {

		String revString = "";

		int lengthOfStr = inputString.length();
		System.out.println(lengthOfStr);

		for (int i = lengthOfStr - 1; i >= 0; i--) {
			revString = revString + inputString.charAt(i);
		}

		return revString;
	}

}
