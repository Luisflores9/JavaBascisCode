package syntax.com.class7;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
	
		/*
		 * Lets ask user were is he from
		 * based on the country we will define favorite food
		 */

		Scanner scan=new Scanner(System.in);
		String country, favoriteFood;
		
		System.out.println("Please tell me where you from");
		country=scan.nextLine();
		
		switch (country.toLowerCase().toUpperCase()) {  //to can convert upper or lower case by "toLowerCase or toUpperCase" and make sure everything is lower or upper case
		
		case "Mexico":
			favoriteFood="Tacos";
			break;
		case "Canada":
			favoriteFood="Poutine";
			break;
		case "Turkey":
			favoriteFood="Lahmacun";
			break;
		case "Pakistan":
			favoriteFood="Pati Chai";
			break;
		case "Egypt":
			favoriteFood="Koshary";
			break;
		case "USA":
			favoriteFood="Burger";
			break;
		default:
			favoriteFood="Unknown";
			
		}
		
		System.out.println("You are from " +country+ " and your favorite food is " +favoriteFood);
		
			
			
		
		}
		
		}
