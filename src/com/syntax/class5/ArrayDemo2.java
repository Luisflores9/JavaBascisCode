package com.syntax.class5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] names=new String[5]; // CRATES AN EMPTY ARRAY OF SIZE 5 TO STORE STRING TYPE VALUES
		
		/*
		 * NAMES[0]="AHMED"; NAMES[1]="KAISER"; NAMES[2]="LUIS"; NAMES [3]="ZAMEER"; NAMES[4]="ELISA";
		 */
		
		
		
		
		Scanner input=new Scanner(System.in);
		
		/*
		 * names[0]=input.next();
		 * names[1]=input.next(); names[2]=input.next(); names[3]=input.next(); names[4]=input.next(); names[5]=input.next();
		 */
		
		for(int i=0; i<=4; i++) {
			names[i]=input.next();
			
		}
		
		System.out.println(Arrays.toString(names));
	}

}
