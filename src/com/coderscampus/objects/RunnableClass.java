package com.coderscampus.objects;

public class RunnableClass {

	public static void main(String[] args) {
		Human guyRoss = new Human();
		
		guyRoss.gender = "male";
		guyRoss.eyeColor = "green";
		guyRoss.height = "5'8\"";
		guyRoss.weight = "120";
		
		System.out.println(guyRoss);
		
		Human trevorPage = new Human();
		
		trevorPage.eyeColor = "brown";
		trevorPage.height = "5'10\"";
		trevorPage.gender = "male";
		trevorPage.weight = "160";
		
		System.out.println(trevorPage);
	}

}
