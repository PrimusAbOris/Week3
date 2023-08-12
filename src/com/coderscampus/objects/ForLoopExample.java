package com.coderscampus.objects;

public class ForLoopExample {
	void ForLoopExample() {
		// start point, keep during, thing done each time
		for(int i = 1; i <= 100; i++) { // i++ = "i = i + 1"
			System.out.print(i + ": "); //not *ln
			System.out.println(i * i);
		}
		
		System.out.println("Done.");
	}
	
	static void incrementExample1(int j) {
		System.out.println("Going up!");
		for(j = 1; j <= 10; j++) {
			System.out.println(j);
		}
		
		System.out.println("Going down!");
		for(j = 9; j > 10; j--) {
			System.out.println(j);
		}
		
		System.out.println("Done.");
	}
	
	static void incrementExample2(int j) {
		System.out.println("Inside incrementExample 2 j: " + j);
	}
}
