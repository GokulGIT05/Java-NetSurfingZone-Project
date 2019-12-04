package com.gk01To10.javaprograms;

import java.util.Scanner;

public class Gk07PalindromeStringUsingForLoop {

	public static void main(String[] args) {

		System.out.println("Enter the String: ");
		Scanner scanNext = new Scanner(System.in);
		String inputVal = scanNext.next();

		int lengthOfString = inputVal.length();
		String revString = "";

		for (int i = lengthOfString - 1; i >= 0; i--) {
			revString = revString + inputVal.charAt(i);
		}

		System.out.println("The Reverse String is: " + revString);

		if (inputVal.equals(revString)) {
			System.out.println("The Given String is Palindrome.");
		} else {
			System.out.println("The Given String is Not Palindrome");
		}

		scanNext.close();
	}

}
