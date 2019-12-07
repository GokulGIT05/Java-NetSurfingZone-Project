package com.gk31To40.javaprograms;

public class Gk37ImmutableClass {

	public static void main(String[] args) {
		// What is immutable -> If we try to modify the exiting object instance variable then new object will be created with the new value

		ImmutableStringDemo obj1 = new ImmutableStringDemo("Gk1");
		ImmutableStringDemo obj2 = new ImmutableStringDemo("Gk1");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println("********************************");
		
		// am trying to modify existing object
		ImmutableStringDemo obj3 = obj1.ifChangeInObjCreateNewObj("Gk1");
		System.out.println(obj1 == obj3);

		ImmutableStringDemo obj4 = obj2.ifChangeInObjCreateNewObj("Gk2");
		System.out.println(obj4 == obj2);
		System.out.println(obj2);
		System.out.println(obj4);
	}

}

final class ImmutableStringDemo {

	// Instance Variable
	private String str;

	public ImmutableStringDemo(String name) {
		str = name;
	}

	// public instance factory Method
	public ImmutableStringDemo ifChangeInObjCreateNewObj(String methodName) {

		if (str == methodName) {
			return this;
		}

		return new ImmutableStringDemo(methodName);
	}

	public String getStr() {
		return str;
	}

}