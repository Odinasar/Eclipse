
public class assignment16 {

	public static void main(String[] args) {
		
		System.out.println(getEvenDigitSum(123456789));	//20
		System.out.println(getEvenDigitSum(252));//4
		System.out.println(getEvenDigitSum(-22));//-1
		System.out.println(getEvenDigitSum(2268912));//20
	 
	}

	public static int getEvenDigitSum(int number) {
		
		if (number<0) {
			return -1;
		}
		
		int sum=0;
		int rem=0;
		
		while(number>0) {
			
			rem=number%10;
			number=number/10;
			if(rem%2==0) {
			sum+=rem;
			}
			
			}            
					
				
			return sum;
		
	}
	
}
