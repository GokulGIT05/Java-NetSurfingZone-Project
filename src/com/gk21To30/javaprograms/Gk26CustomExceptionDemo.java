package com.gk21To30.javaprograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Gk26CustomExceptionDemo {

	public static void main(String[] args) {

		try {
			System.out.println("Enter 1 to throw Exception: ");
			Scanner scanVal = new Scanner(System.in);
			int i = scanVal.nextInt();
			System.out.println("Inside Main");
			scanVal.close();
			if (i == 1) {
				throw new MyCustomException("Custom Exeption");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("End of First Custom Exception");
		
		System.out.println("*******************************");
		
		String date = "12423";
		
		DateFormat df = new SimpleDateFormat("dd-MM-YYYY");
		
		try {
			df.parse(date);
		}catch (Exception e) {
			// More Standard way.
			throw new MyStandartCustomException("Hi Standard Exception", e);
		}
		
		System.out.println("End Of Main"); // This line wont execute.

	}

}

// extends to RuntimeException so its checked Unchecked Exception
class MyStandartCustomException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyStandartCustomException(String message,Throwable throwable){
		super(message,throwable);
	}
}


// extends to Exception so its checked Exception
class MyCustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyCustomException(String message) {
		super(message);
	}

}



