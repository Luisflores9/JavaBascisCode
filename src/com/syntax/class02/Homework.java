package com.syntax.class02;

public class Homework {

	public static void main(String[] args) {
		
	/*
	 * 1 Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”
	 * 2 Write a program to find the square of the number 3.9. You program should say “The square of the ____ is ____ ”
	 * 3 Write a program to print the area and perimeter of a rectangle with width = 5 and height = 8. Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
	 */
		

		double num1=5.99;
		double num2=10.50;
		double add, sub, multi, div;
		add=num1+num2;
		sub=num1-num2;
		multi=num1*num2;
		div=num1/num2;
		System.out.println( "The addition of 2 numbers " +num1+ " and " +num2+ " is equal to " +add);
		System.out.println( "The subtraction of 2 numbers " +num1+ " and " +num2+ " is equal to " +sub);
		System.out.println( "The multiply of 2 numbers " +num1+ " and " +num2+ " is equal to " +multi);
		System.out.println( "The divide of 2 numbers " +num1+ " and " +num2+ " is equal to " +div);
		
		
		double number1=3.9;
		double square=number1*number1;
		System.out.println( "The square of the number1 is "+square);
		
		int width=5;
		int height=8;
		int area=5;
		int perimeter=26;
		
		System.out.println( "The perimeter of the rectangle with width " +width+ " and height " +height+ " is equal to " +perimeter+ " and the area is " +area);
		
				
		
		
	}

}
