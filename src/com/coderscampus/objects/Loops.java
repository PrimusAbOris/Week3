package com.coderscampus.objects;

public class Loops {

	public static void main(String[] args) {
		// start point, keep during, thing done each time
		for(int i = 1; i <= 100; i = i + 1) {
			System.out.print(i + ": "); //not *ln
			System.out.println(i * i);
		}
		
		System.out.println("Done.");
	}
}
