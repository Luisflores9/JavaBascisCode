package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=true;
		int dose=1;
		
		
		if(vaccine) {
			System.out.println("let me check if you got the second dose");
			
			if(dose==1) {
				System.out.println("You need 1 more shot");
				
			}
			System.out.println("---------------------------------------");
			
			String month="May";
			int day=8;
			
			if(month.equals("May")) {
				
				System.out.println("Let me check what todays date is");
				
				if (day==8) {
					System.out.println("Todays is Mothers Day");
					
				} else if (month.equals("June")) {
					System.out.println("Let me check what is todays date");
					
					if (day==19) {
						System.out.println("Todays is father day");	
					}
			}
			
			}	
		}

	}

}
