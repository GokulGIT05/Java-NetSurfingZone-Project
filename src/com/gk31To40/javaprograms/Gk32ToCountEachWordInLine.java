package com.gk31To40.javaprograms;

import java.util.StringTokenizer;

public class Gk32ToCountEachWordInLine {

	public static void main(String[] args) {

		String inputStr = "A BC DEF GHIJ";

		toFindNoOfCharInEachWord(inputStr);
		System.out.println("************************************");
		usingStringTokenizer(inputStr);

	}

	private static void toFindNoOfCharInEachWord(String inputStr) {

		// 1. Convert String into char array.
		// 2. Loop CharArray
		// 3. Inside Loop Create a string for Each Character.
		// 4. Again use while loop, for separation of each word

		char[] charArray = inputStr.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			String eachWord = "";

			while (i < charArray.length && charArray[i] != ' ') {
				eachWord = eachWord + charArray[i];
				i++;
			}

			System.out.println("The Word is: " + eachWord);
			System.out.println("The Lenght of the word is: " + eachWord.length());
			System.out.println("------------------------");

		}

	}

	private static void usingStringTokenizer(String inputStr) {
		
		StringTokenizer strToken = new StringTokenizer(inputStr);
		System.out.println(strToken);
		
		while(strToken.hasMoreTokens()) {
			String eachWord = strToken.nextToken();
			System.out.println("The Word is: " + eachWord);
			System.out.println("The Lenght of the word is: " + eachWord.length());
			System.out.println("------------------------");
		}
		
	}

}
