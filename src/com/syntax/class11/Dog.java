package com.syntax.class11;

import java.util.Scanner;

public class Dog {

	//ATTRIBUTES HOW THE OBJECT WILL LOOK LIKE
	String name;
	int age;
	double weight;
	String color;
	double height;
	String breed;
	// HOW THAT OBJECT BEHAVE
	void bark() {
		System.out.println("Dog Barks");
	}
	void walks() {
		System.out.println("Dogs walks");
	}
	void eat() {
		System.out.println("Dogs like to eat bone");
	}
	public static void main(String[]   args) {
		
		//Scanner scan= new Scanner(System.in);
		
		Dog jimmy=new Dog();		//CREATING AN OBJACT AND STORING IN A VARIABLE
		jimmy.name="Jimmy";
		jimmy.age=6;
		jimmy.weight=16;
		jimmy.color="Black";
		jimmy.height=2.6;
		jimmy.breed="German";
		jimmy.bark();
		// NEW DOG() HOW WE CREATE A OBJECT
		
		
	}
}
