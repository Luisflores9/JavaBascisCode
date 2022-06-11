package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		
		boolean didReplit=true;
		int assignments;
		
		if (didReplit) {
			System.out.println("How many assignment did you finished");
			assignments=14;
			
			if (assignments>15) {
				System.out.println("You did great job");
			} else if (assignments>10) {
				System.out.println("You did good job");
			}else {
				System.out.println("Please complete all replit assignments");
				
			}
			
		}else  {
			System.out.println("You should complete Replit HW");
			
		}

	}

}
