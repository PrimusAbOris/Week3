package com.coderscampus.objects;

import java.util.Random;
import java.util.Scanner;

public class RunnableClass {

	public static void main(String[] args) {
		// some examples of types and libraries
		Random random = new Random();
		java.lang.String dudeString = "Hello, my dudes!";
		
		int total = 0;
		int next = 0;
		for (int i = 0; i < 20; i++) {
			// between 0 and 9, plus 1
			next = random.nextInt(10) + 1;
			total = total + next;
			System.out.println("Can't have a rainbow without 20d10, baby! " + next);
			if (next == 10) {
				System.out.println("HIT!!");
				total++;
			}
		}
		System.out.println("YOUR SCORE: " + total);
		
		if (total > 110 && total < 130) {
			System.out.println("Nice!");
		} else if (total >= 130) {
			System.out.println("Incredible! You're the real Ridge Racer!");
		} else if (total >= 91) {
			System.out.println("The quick divine beast jumps over the perpetual mountain.");
		}
		if (total == 139) {
			System.out.print("今夜日白残夢来ます");
		}
		System.out.println("Dice rolling complete. Press Enter to commence human creation.");
		promptEnterKey();
		
		Human refutation = new Human();
		refutation.eyeColor = dudeString;
		
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
	
	public static void promptEnterKey() {
		   Scanner enterBlock = new Scanner(System.in);
		   enterBlock.nextLine();
	}

}
