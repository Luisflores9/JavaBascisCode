package com.syntax.class12;

public class stringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Batch 13 is great";
		System.out.println(str.startsWith("fozen")); //IT DOESNT STAR WITH BATCH
		System.out.println(str.endsWith("t"));
		System.out.println(str.endsWith("Great"));  // BECUASE IS GREAT IS NOT LOWER CASE (G)REAT
		System.out.println(str.toLowerCase().endsWith("great"));
		
		
		String name="HAMID";
		System.out.println(name.toLowerCase());
		System.out.println(name);
		
		
		System.out.println(str.contains("13")); 	// CONTAINS BECAUSE "BATCH 13 IS GREAT" 
		System.out.println(str.contains("is"));
		System.out.println(str.toLowerCase().contains("batch"));
		
		}

}
