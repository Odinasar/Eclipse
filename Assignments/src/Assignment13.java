
//Writea second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
//The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
//It should call the method isOdd to check if each number is odd.
//The parameters end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
//If those conditions are not satisfied return -1 from the method to indicate invalid input.
//
//Sample outputs:
//
//System.out.println(sumOdd(1,100)); // should print 2500
//System.out.println(sumOdd(-1,100)); // should print -1
//System.out.println(sumOdd(100,100)); // should print 0
//System.out.println(sumOdd(100,-100)); // should print -1
//System.out.println(sumOdd(100,1000)); // should print 247500


public class Assignment13 {

	public static void main(String[] args) {
		System.out.println(sumOdd(1,100)); // should print 2500
		System.out.println(sumOdd(-1,100)); // should print -1
		System.out.println(sumOdd(100,100)); // should print 0
		System.out.println(sumOdd(100,-100)); // should print -1
		System.out.println(sumOdd(100,1000)); // should print 247500
	}

	public static boolean isOdd(int number) {
		
		if (number<0) {
		
		return false;

		}else if(number%2==1) {
			return  true;
			
		}else {
			return false;
		}
	}
	
	
	
	public  static int sumOdd(int start,int end) {
		
		if(start>end||(start<=0||end<=0)) {
			
			return -1;
		
		}else {
			int sum=0;
		   for(int i=start;i<=end;i++) {
			   if(isOdd(i)) {
			    
				sum=sum+i;
				
				
			   }
		   }return sum;
		}
	}
}
				
		
			
				
			 
			
	
		
		
		
	
	
	
	


