
public class CompilerandCompiled {

	public static void main(String[] args) {
		
		
		
		int num1=20;
		int num2=10;
		int num3=22;
		
		
		/* compiler can initialize variables to its default values
		 * int->0
		 * double_>0.0
		 * boolean= True/False
		 * String->null
		 * 
		 */
		int largest=0;
		
		if (num1>num2 && num1>num3) {
			largest = num1;
			
		} else if (num3>num1 && num3>num2) {
			largest= num3;
			
		} else if (num2> num1 && num2>num3) {
			largest=num2;
			
		}else {
			System.out.println("all nmbers are equal");
		}
			
			System.out.println("The largest number is" +largest);
			
			
		}

	}
