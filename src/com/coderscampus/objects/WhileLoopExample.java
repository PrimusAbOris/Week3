package com.coderscampus.objects;
import java.util.Date;

public class WhileLoopExample {
	void whileLoopExample1() {
		/* "syso" + Ctrl+Space
		System.out.println();
		*/
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i = i + 1;
		}
	}
	
	void whileLoopExample2() {
		Date now = new Date();
		Date stopNow = new Date(123, 8, 12, 16, 10, 0);
		System.out.println(now);
		System.out.println(stopNow);
		
		int i = 0;
		while (now.before(stopNow)) {
			i = i + 1;
			System.out.println(i + ": " + now);
			now = new Date();
		}
	}

}
