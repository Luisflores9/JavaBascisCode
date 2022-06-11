package com.syntax.class04;

import java.util.Scanner;

public class UserInput {  // Scanner is a class that needs to be imported 

	public static void main(String[] args) {
	
		String str="hello";
		
		// Creating a scanner
		Scanner input=new Scanner(System.in);
		
		//send instructions to the console
		System.out.println("Please enter your name");
		
		//we need to grab the value from console. Only Scanner can grab the value which is Input
		String name=input.next(); //after you type the value to hit enter
		
		System.out.println(name);
		
		//lets send the instructions
		System.out.println(name + "Pleas enter your age");
		
		// Need to capture and store age
		int age=input.nextInt();
		
		System.out.println(name +"is "+age + "years old");
		
		
		
		
		
		
		

	}

}
