package com.syntax.class5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=scanner.nextInt();							// ASK FOR A SIZE OF ARRAY
		String[] names=new String[size];					// AN ARRAY OF STRING OF THAT SIZE IS CREATED
		for (int i=0; i<names.length; i++) {
			names[i]=scanner.next();						// FILL THE ARRAY WITH THE INPUT FROM THE USER
	}
	
		System.out.println(Arrays.toString(names));
		

}
}