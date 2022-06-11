package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I am always confused";
		
		System.out.println(str.indexOf('c'));
		System.out.println(str.indexOf("always")); //INDEX COUNTS EVERYTHING BEFORE THE WORD INCLUDING SPACES
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf(' '));
		
		System.out.println(str.indexOf('z')); // IF THE NUMBER IS NOT ON IT THEN IT WILL PRINT -1
		
	}

}
