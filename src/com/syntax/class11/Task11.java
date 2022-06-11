package com.syntax.class11;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		// Write a program to print out duplicate elements from an Array of Strings?
		
		  //Initialize array
      String [] arr = new String [] {"Sameer","Riza" ,"Zameer","Omid","Arif","Hedayat"
      		,"Sameer","Zameer"};
      System.out.println("Duplicate elements in given array are the following:" );
      System.out.println();
      //Searches for duplicate element
      for(int i = 0; i < arr.length; i++) {
          for(int j = i + 1; j < arr.length; j++) {
              if(arr[i] == arr[j])
                  System.out.println(arr[+j]);
		
		
	}
      }
	}
}
