
public class SwitchDemo {

	public static void main(String[] args) {
		
		char choice='Y';
		String meaning;
		
		switch(choice) {   //Variables and matching cases MUST be of the same type
							// Switch does not allow to have duplicate cases
		
		case 'Y':
			meaning="yes";
			break;
		case 'M':
			meaning="Maybe";
			break;
		case 'N':
			meaning="No";
			break;
		default:
			meaning="Unknown";
		}
		
		System.out.println(meaning);
		
			
		}

	}
