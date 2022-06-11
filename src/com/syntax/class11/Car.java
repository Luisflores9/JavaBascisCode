package com.syntax.class11;

public class Car {
	
	String model;
	String make;
	String color;
	int year;
	String typeOfEngine;
	int HP;
	
	void MoveForwards() {
		System.out.println("Car is moving forward");
	}
	
	void reverse() {
		System.out.println("Moving backwards");
	}
	
	public static void main(String[]  args) {
		Car bmw=new Car();
		bmw.model="x6";
		bmw.make="bmw";
		bmw.color="black";
		bmw.year=2022;
		bmw.typeOfEngine="V8";
		bmw.HP=500;
		
		
		
		Car lexus=new Car();
		lexus.model="Lexus";
		lexus.make="DXR";
		lexus.color="Black";
		lexus.year=2022;
		lexus.typeOfEngine="V4";
		lexus.HP=500;
	
	}
		

}
