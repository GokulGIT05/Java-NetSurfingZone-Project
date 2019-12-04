package com.gk21To30.javaprograms;

public class Gk23StringSubStringDemo {

	public static void main(String[] args) {

		String inputStr = "123456789";

		int beginIndex = inputStr.length() - 3;
		System.out.println("Begin Index: " + beginIndex);

		// 1. public String substring(int beginIndex) return new String Object.
		String last3Digit = inputStr.substring(beginIndex); // This will remove first char to specified value -1.
		System.out.println("last3Digit: " + last3Digit);

		// 2. public String substring(int beginIndex, int endIndex)
		String first3Digit = inputStr.substring(0, 3);
		System.out.println("first3Digit: " + first3Digit);

	}

}
