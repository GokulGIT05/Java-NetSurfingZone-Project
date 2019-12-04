package com.gk21To30.javaprograms;

public class Gk25ToCountObjectInJava {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		ObjectCountFirstWay obj1 = new ObjectCountFirstWay();
		ObjectCountFirstWay obj2 = new ObjectCountFirstWay();
		ObjectCountFirstWay obj3 = new ObjectCountFirstWay();
		ObjectCountFirstWay obj4 = new ObjectCountFirstWay();
		ObjectCountFirstWay obj5 = new ObjectCountFirstWay();
		ObjectCountFirstWay obj6 = new ObjectCountFirstWay();

		System.out.println("No Of Object Created using instance block: " + ObjectCountFirstWay.noOfObjCreated);

		System.out.println("***********************************");

		ObjectCountSecondWay objScndWay1 = new ObjectCountSecondWay();
		ObjectCountSecondWay objScndWay2 = new ObjectCountSecondWay();
		ObjectCountSecondWay objScndWay3 = new ObjectCountSecondWay();
		ObjectCountSecondWay objScndWay4 = new ObjectCountSecondWay();
		ObjectCountSecondWay objScndWay5 = new ObjectCountSecondWay();

		System.out.println("No Of Object Created Using Contructor: " + ObjectCountSecondWay.noOfObjCreated);

	}

}

class ObjectCountFirstWay {

	public static int noOfObjCreated = 0;
	// using instance block.
	{
		noOfObjCreated++;
	}

}

class ObjectCountSecondWay {

	public static int noOfObjCreated = 0;

	// Using Constructor

	public ObjectCountSecondWay() {
		noOfObjCreated++;
	}

}