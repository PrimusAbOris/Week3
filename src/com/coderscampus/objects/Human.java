package com.coderscampus.objects;

public class Human {
	String gender;
	String height;
	String weight;
	String eyeColor;
	
	Human () {
		System.out.println("The door to the dark world will not open without properties.");
	}
	
	Human(String gender, String height, String weight,
			String eyeColor) {
		System.out.println("The door to the dark world has been opened.");
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
	}
	
	String getInfo() {
		return "Gender: " + gender + ", Height: " + height +
				", Eye Color: " + eyeColor + " Weight: " + weight;
	}
	
	/* "C-like" version
	void setProperties(String _gender, String _height, String _weight,
			String _eyeColor) {
		gender = _gender;
		height = _height;
		weight = _weight;
		eyeColor = _eyeColor;
	}
	*/
	
	/* deprecated by the new constructor
	void setProperties(String gender, String height, String weight,
			String eyeColor) {
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
	}
	*/
}
