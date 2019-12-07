package com.gk31To40.javaprograms;

import java.util.Scanner;

public class Gk38SumOfDigits {

	public static void main(String[] args) {

		System.out.println("Enter the Number:  ");
		Scanner scanObj = new Scanner(System.in);
		int inputValue = scanObj.nextInt();

		int sumOfValue = 0;

		while (inputValue > 0) {

			sumOfValue = sumOfValue + inputValue % 10;
			System.out.println(sumOfValue);
			System.out.println(inputValue);
			inputValue = inputValue / 10;
		}
		System.out.println("The Sum of Value is: " + sumOfValue);
		scanObj.close();
	}

}
