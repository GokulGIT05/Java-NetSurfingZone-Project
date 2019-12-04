package com.gk01To10.javaprograms;

import java.util.Scanner;

public class Gk07PalindromeString {

	public static void main(String[] args) {

		// Using My Way (Using StringBuilder).
		System.out.println("Enter the String: ");
		Scanner scanStr = new Scanner(System.in);
		String inputStr = scanStr.next();

		StringBuilder sb = new StringBuilder(inputStr);
		StringBuilder revSb = sb.reverse();

		String revStr = new String(revSb);

		if (inputStr.equals(revStr)) {
			System.out.println("The Given String is Palindrome");
		} else {
			System.out.println("Not Palindrome");

		}

		scanStr.close();
	}

}
