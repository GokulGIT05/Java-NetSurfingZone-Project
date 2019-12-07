package com.gk31To40.javaprograms;

public class Gk33ToCheckAlphaberOrNot {
	// Program to check given character is alphabet or not in java
	public static void main(String[] args) {

		char inputChar = 'f';

		if (inputChar >= 'a' && inputChar <= 'z' || inputChar >= 'A' && inputChar <= 'Z') {
			System.out.println("The Given Character is Alphabet");
		} else {
			System.out.println("The Given Character is Not Alphabet");
		}
		
	}

}
