package com.syntax.class12;

public class Phone {
	
	String model;
	String make;
	String color;
	int size;

	
	void call() {
		System.out.println("Calling someone");
	}
	void color() {
		System.out.println("What color is your phone");
	}
	public static void main(String[]   args) {
		
		Phone XS11=new Phone();
		XS11.model="Apple";
		XS11.make="XS 11";
		XS11.color="Black";
		XS11.size= 11;
		XS11.call();
		
		
	}

}
