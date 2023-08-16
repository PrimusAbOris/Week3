package com.coderscampus.objects;

import java.util.Random;

public class RunnableClass {

	public static void main(String[] args) {
		// some examples of types and libraries
		Random random = new Random();
		java.lang.String dudeString = "Hello, my dudes!";
		
		for (int i = 0; i < 20; i++) {
			// between 0 and 9, plus 1
			System.out.println("Can't have a rainbow without 20d10, baby! " + (random.nextInt(10) + 1));
		}
		
		Human guyRoss = new Human("male", "5'8\"", "120", "green");
		
		System.out.println(guyRoss.getInfo());
		
		Human trevorPage = new Human("male", "5'10\"", "160", "brown");
		
		System.out.println(trevorPage.getInfo());
		
		Human sakuyaIzayoi = new Human("female", "5'9\"", "132", "blue");
		
		System.out.println(sakuyaIzayoi.getInfo());
		
		/* Example of the slow way */
		sakuyaIzayoi.eyeColor = "blue";
		sakuyaIzayoi.height = "5'9\"";
		sakuyaIzayoi.weight = "132";
		sakuyaIzayoi.gender = "female";
	}

}
