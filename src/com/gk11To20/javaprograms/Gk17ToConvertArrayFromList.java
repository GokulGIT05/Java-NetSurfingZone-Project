package com.gk11To20.javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Gk17ToConvertArrayFromList {

	public static void main(String[] args) {

		List<String> listOfStr = new ArrayList<String>();
		listOfStr.add("Gk1");
		listOfStr.add("Gk2");
		listOfStr.add("Gk3");
		listOfStr.add("Gk4");
		listOfStr.add("Gk5");

		System.out.println("In ArrayList: " + listOfStr);
		System.out.println("******************************");

		/*
		 * // Below is not Possible String[] arrayOfString = (String[])
		 * listOfStr.toArray(); System.out.println("As Array: "+arrayOfString);
		 */

		String[] arrayOfStr = new String[listOfStr.size()];
		// public T[] toArray(T[] arr)
		arrayOfStr = (String[]) listOfStr.toArray(arrayOfStr); // Need to pass the arrayObj


		for (String temp : arrayOfStr) {
			System.out.println(temp);
		}
	}

}
