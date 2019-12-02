package com.gk01To10.javaprograms;

import java.util.Scanner;

public class Gk05ReverseString {

	public static void main(String[] args) {

		System.out.println("Enter the String: ");
		Scanner scanStr = new Scanner(System.in);
		String inputStr = scanStr.nextLine(); // next() will take only first String before Space.

		// Not Thread Safe.
		StringBuilder sb = new StringBuilder(inputStr);
		StringBuilder revStr = sb.reverse();

		String reversedStr = revStr.toString();
		System.out.println(reversedStr);

		scanStr.close();
	}
}
