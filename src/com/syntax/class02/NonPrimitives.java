package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name="Oleg";
		
		String lastName="smith";
		
		long Phone=1234567891;
		
		//xxx-xx-xxxx
		// string is a combination of numbers and letters and has to have quotations
		
		String phoneNumber="123-456-7890";
		String address="123 Washington St";
		
		int age=30;
		String age1="30";
		
		String city="Miami";
		
		
		  
				//If you have add quotation on int it will consider a String
				//if no quotation is added then its a variable

		//shortcut for printing 
		//syso +ctrl +space--> hit enter
		
		/* 
		 * we can use 
		 * + to attach a String to String
		 * to attach string to a double
		 * to any other type
		 * to attach String to Int
		 */
		
		System.out.println(name+" "+lastName);//Oleg Smith
		
		//Oleg lives in Miami
		System.out.println(name+" lives in "+city);
		
		//Oleg is 30 years old
		System.out.println(name+" is "+age+" years old");
		
	
		/*
		 * Rules for Identifiers 
		 *1. No Spaces
		 *2. No Keywords
		 *3. Cannot start with numbers (numbers can be used after the
		 *4. connont have with special characters (except _, $)
		 */
		
		// String break="Hello"
		// 1number=10
		
		int number1=10;
		// int num%=20; error
				double $price=3.99;
				float f_=2.09f;
						
		// Naming Conventions:
		/*
		 * Follow camel casing
		 * variable/methods names should start with lowercase and then 
		 * class names should start with uppercase
		 */
			
				String MyCity="Fredericksburg";
				
				
						
		
		
		
		
		
		
		
	}

}
