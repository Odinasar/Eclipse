
public class SwitchStatement {

	public static void main(String[] args) {
		//int switchValue=3;
		
//		switch(switchValue) {
//		case 1:
//		System.out.println("value was 1");
//		break;
//		case 2:
//		System.out.println("value was 2");
//		break;
//		case 3:
//		System.out.println("value was 3 or 4, or 5");
//		break;
//		default:
//		System.out.println("Was not corect value");
//		break;
//		}

		char charValue='D';
		
		switch(charValue) {
		case 'A': case 'B': case 'C': case 'D': case'E':
			System.out.println(charValue +" was found");
			break;
			
			default:
				System.out.println(charValue+" was not found");
		
		}
		
		
		
	}

	
	
}
