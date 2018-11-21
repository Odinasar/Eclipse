
public class assignment10 {

	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);

	}
	
	public static void printYearsAndDays(long num) {
	
		
		if(num<0) {
			System.out.println("Invalid Value");
			
			
		}else {
			
			long year=num/60/24/365;
			long day=num/60/24%365;
			System.out.println(num + "min = " + year +" y and " + day +" d");		
			
			
		}
	}

}
