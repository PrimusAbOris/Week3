package com.coderscampus.objects;

import java.util.Scanner;

public class Week3Exercise {
	static Integer checkValidity(int number) {
		if ((number < 50) | (number > 300)) {
			return null;
		}
		else {
			return number;
		}
	}

	public static void main(String[] args) {
		System.out.println("Type in a number. If it's not between 50 and 300, you'll be sorry.");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Integer convertedInput = Integer.parseInt(input);
		
		String output = new String();
		if (checkValidity(convertedInput) == null) {
			output = "null";
		} else {
			output = checkValidity(convertedInput).toString();
		}
		
		System.out.println("The number you typed in was: " + output);
	}
}
