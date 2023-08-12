package com.coderscampus.objects;

public class Loops {

	public static void main(String[] args) {
		/*
		ForLoopExample forExample1 = new ForLoopExample();
		forExample1.ForLoopExample();
		
		WhileLoopExample whileExample = new WhileLoopExample();
		whileExample.whileLoopExample1();
		
		WhileLoopExample whileExample2 = new WhileLoopExample();
		whileExample2.whileLoopExample2();
		*/
		int j = 0;
		ForLoopExample.incrementExample2(++j); //++j increments j FIRST
		System.out.println("Outside method j: " + j);
		ForLoopExample.incrementExample2(j++);
		System.out.println("Outside method j: " + j);
	}
}
