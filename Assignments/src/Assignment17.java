import java.util.Scanner;
public class Assignment17 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		boolean endless=true;
		
		
	
		int max=0;
		int min=0;
		
	while(endless) {
		
		
		System.out.println("Enter number");
		
		int num=input.nextInt();
		
		if (input.hasNextInt()==false) {
	System.out.println("Invalid input");
			input.close();
			break;
		
		
		}else if (num<min) {
			
			min=num;
		}
		 if(num>max) {
			max=num;
			
	
		}
		 if (num<max) {
			 min=num;
		 }
		 
		
		 //System.out.println(max+" maximum number" +" | "+ min+" minimum number ");
//		if (num>min) {
//			
//			max=num;
//		}
//		 if(num>max) {
//			min=num;
//			
//	
//		}
//		 if (num<max||num<min) {
//			 min=num;
//		 }
 
		
		System.out.println(max+" maximum number" +" | "+ min+" minimum number ");
		
	}
	
			
	
			
			
			
			
	//System.out.println("invalid input");
			
//Read the numbers from console entered by the user and print the minimum 
//	and maximum number the user has entered.
//	Before the user enters the number, print the message "Enter number"
//	If the user enters an invalid number, break out of the loop 
//	and print the minimum and maximum number.
//
//	Hint:
//	Use an endless while loop
			
		
		}	
		
	}


