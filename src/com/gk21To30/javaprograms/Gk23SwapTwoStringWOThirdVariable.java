package com.gk21To30.javaprograms;

public class Gk23SwapTwoStringWOThirdVariable {

	public static void main(String[] args) {

		String s1 = "1234";
		String s2 = "567";

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		System.out.println();
		s1 = s1.substring(s2.length());

		System.out.println("After Swap:");
		System.out.println(s1);
		System.out.println(s2);
	}

}
