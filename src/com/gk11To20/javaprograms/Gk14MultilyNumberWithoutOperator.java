package com.gk11To20.javaprograms;

import java.util.Scanner;

public class Gk14MultilyNumberWithoutOperator {

	// Write a program for multiplication of two numbers without using
	// multiplication operator in java ?
	public static void main(String[] args) {

		System.out.println("Enter the First Number: ");
		Scanner scanInput = new Scanner(System.in);
		int n1 = scanInput.nextInt();
		System.out.println("Enter the Second Number: ");
		int n2 = scanInput.nextInt();

		int multipliedValue = 0;

		for (int i = 0; i < n2; i++) {
			// Add n1, till times of n2.
			multipliedValue = multipliedValue + n1;
		}

		System.out.println("Multiplied Value: " + multipliedValue);
		scanInput.close();

	}

}
