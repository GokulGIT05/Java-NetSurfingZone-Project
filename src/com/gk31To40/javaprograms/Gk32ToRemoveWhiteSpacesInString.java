package com.gk31To40.javaprograms;

import java.util.Scanner;

//Program to count characters in given line of String
public class Gk32ToRemoveWhiteSpacesInString {

	public static void main(String[] args) {

		System.out.println("Enter the Line: "); // 1 2 3 4 5 6
		Scanner scanLine = new Scanner(System.in);
		String line = scanLine.nextLine();
		countNoOfCharacter(line);
		simpleWayToFindRemoveWhiteSpace(line);
		scanLine.close();
	}

	private static void simpleWayToFindRemoveWhiteSpace(String line) {

		String s = line.replaceAll(" ", "");
		System.out.println("Replaced White Spaces: " + s);

	}

	private static void countNoOfCharacter(String line) {

		// 1. Need to convert Whole String into one String Without space.
		// convert string into char[]
		char[] inputChar = line.toCharArray();
		System.out.println(inputChar);

		String finalString = "";

		for (int i = 0; i < inputChar.length; i++) {
			// Again While Loop
			if (!(inputChar[i] == ' ')) {
				finalString = finalString + inputChar[i];
			}
		}

		System.out.println(finalString);
		System.out.println("No Of Character is: " + finalString.length());

	}

}
