package com.coderscampus.objects;

public class RunnableClass {

	public static void main(String[] args) {
		Human guyRoss = new Human();
		
		guyRoss.setProperties("male", "5'8\"", "120", "green");
		
		System.out.println(guyRoss.getInfo());
		
		Human trevorPage = new Human();
		
		trevorPage.setProperties("male", "5'10\"", "160", "brown");
		
		System.out.println(trevorPage.getInfo());
		
		Human sakuyaIzayoi = new Human();
		
		/* Example of the slow way */
		sakuyaIzayoi.eyeColor = "blue";
		sakuyaIzayoi.height = "5'9\"";
		sakuyaIzayoi.weight = "132";
		sakuyaIzayoi.gender = "female";
		
		System.out.println(sakuyaIzayoi.getInfo());
	}

}
