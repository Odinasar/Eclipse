//import java.util.Scanner;
import java.util.*;
public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
//		
//		
		System.out.println("Enter a byte value");
		byte b1=scanner.nextByte();
		System.out.println("My byte value is "+ b1);
		

		System.out.println("Enter a short value");
		short s1=scanner.nextShort();
		
//		
		System.out.println("Enter int value");
		int I1=scanner.nextInt();
		
//	
		System.out.println("Enter boolean value");
		boolean bool=scanner.nextBoolean();
//		
     	System.out.println(b1+" | "+s1+"| " +I1+"| "+bool);
//		
		scanner.nextLine();// this must be between * and string 
		
		
		System.out.println("Enter your name");
		String str=scanner.nextLine();
		System.out.println(str);
		
		scanner.close();//closing scanner if its needed
	}
	

}
