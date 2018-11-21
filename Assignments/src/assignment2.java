
public class assignment2 {

	public static void main(String[] args) {
		printMegabytesAndKilobytes(2050);

	}
	
	public static void printMegabytesAndKilobytes(int num) {
		if(num<0) {
		System.out.println("Invalid Number");
	}

		int mb=num/1024;
		int kb=num%1024;
		System.out.println(num+" KB = "+mb+" MB and "+ kb+" KB");
}
}