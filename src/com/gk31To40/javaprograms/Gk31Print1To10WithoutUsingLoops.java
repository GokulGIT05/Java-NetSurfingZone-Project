package com.gk31To40.javaprograms;

public class Gk31Print1To10WithoutUsingLoops {

	public static void main(String[] args) {

		recursivePrintMethod(1);

	}

	public static void recursivePrintMethod(int n) {
		if (n <= 10) {
			System.out.println(n);
			// recursivePrintMethod(n++); // This will throw Error, Because after passing
			// the parameter it will increment the value.
			recursivePrintMethod(++n);
		}
	}

}
