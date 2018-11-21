import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int sum=0;
		int count=1;
   while(count<11) {
	   
	   
        System.out.println("Enter number " + count);
		boolean bool=scanner.hasNextInt();
		
        if(bool) {
        
        int i1=scanner.nextInt();
		sum+=i1;
		count++;
		System.out.println("My byte value is "+ i1);
		
		}else  {
			System.out.println("invalid input");
			scanner.nextLine();
		}
        
   }
   System.out.println(sum);
   scanner.close();
	}

}
