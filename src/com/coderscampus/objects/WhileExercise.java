package com.coderscampus.objects;

import java.util.Scanner;

public class WhileExercise {
	public static void main(String[] args) {
		Integer input = 0;
		
		while (input < 50 || input > 300) {
			System.out.println("Type in a number. Between 50 and 300.");
			Scanner scanner = new Scanner(System.in);
			String inputManual = scanner.nextLine();
			input = Integer.parseInt(inputManual);
			if (input < 50 || input > 300) {
				System.out.println("Not good enough!");
			}
			else {
				System.out.println("There you go.");
			}
			System.out.println("The number you typed in was: " + input);
		}
	}
	/* deprecated
	public static Integer checkValidity(int number) {
		if (number < 50 || number > 300) {
			return null;
		}
		else {
			return number;
		}
	}
	*/
}
