package com.gk01To10.javaprograms;

import java.util.Scanner;

public class Gk03PrimeOrNotSimple {

	// This program will Work Now
	public static void main(String[] args) {

		System.out.println("Enter the Number: ");
		Scanner scan = new Scanner(System.in);
		int inputVal = scan.nextInt();

		boolean isEven = false;

		if (inputVal % 2 == 0) {
			isEven = true;
		}

		if (inputVal == 2 || (!isEven && inputVal != 0 && inputVal != 1)) {
			System.out.println("The Given Number is Prime");
		} else
			System.out.println("Not Prime");
		
		scan.close();

	}

}
