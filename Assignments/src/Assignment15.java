//import java.util.*;

public class Assignment15 {

	public static void main(String[] args) {
	System.out.println(FirstAndLast(252)); //should return 4, first digit 2 and the last is 2 which gives us 2+2 and the sum is 4
	System.out.println(FirstAndLast(257)); //should return 9, first digit 2 and the last is 9 which gives us 2+7 and the sum is 9
	System.out.println(FirstAndLast(0)); //should return 0, first digit 0 and the last is 0 which gives us 0+0 and the sum is 0
	System.out.println(FirstAndLast(5)); //should return 10, first digit 5 and the last is 5 which gives us 5+5 and the sum is 10
	System.out.println(FirstAndLast(-10)); //should return -1, because the parameter is negative
	}

	
	

	
	public static int FirstAndLast(int number) {
	
		if(number<0) {
		return 	number= -1;
			
	} 
	
	int rem=number%10;
		while(number>=9) {
			
			
	    number=number/10;
		//System.out.println(number);
		}
		//int rem2=number%10;
		int sum=rem+number;
		return sum;
    } 

}
