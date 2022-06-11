package com.syntax.class11;

import java.util.Arrays;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WRITE A JAVA PRGRAM TO FIND THE SECOND LARGEST NUMBER IN THE ARRAY?
		
		int [] arr= {10,20,5,6,8,200,200};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);		//LAST INDEX IS ALWAYS SIZE -1
		System.out.println(arr[arr.length-2]);		//
		

	}

}
