//import java.util.Scanner;
//
//public class Array {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
////		int[]arra=new int[10];
////		arra[0]=35;
////		arra[1]=30;
////		
////		int[] arra1= {1,2,30,30};
////		System.out.println(arra[2]+"|"+ arra1[3]);
////		
////		System.out.println("________________________");
//		
//		int[] myInteger=getInteger(5);
//		System.out.println(getAverage(myInteger));
//	}
//
//	
//	//create a method-getInteger
//	public static int[] getInteger(int num) {
//		int[]values=new int[num];
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter a number");
//		 
//		 for (int i=0;0<values.length;i++) {
//			 values[i]=scanner.nextInt();
//		 }
//		return values;
//	}
//	
//	
//	public static double getAverage(int[]array) {
//		int sum=0;
//		for(int i=0;i<array.length;i++) {
//			sum+=array[i];
//		}
//		return (double)sum/array.length;
//	}
//	
//}



import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int[] myIntArray = new int[10];
		myIntArray[0]=35;
		myIntArray[1]=30;
		
		int[] myIntArray2 = {1,20,30,4,5};
		
		System.out.println(myIntArray[2] + "|" + myIntArray2[4]);
		
		System.out.println("------------------");
		
		int[] myIntegers=getIntegers(3);
		System.out.println("The average is:" + getAverage(myIntegers));
		//System.out.println(Array.toString(myIntegers));
		
		
		
	}
	
	//create an method - getIntegers
	public static int[] getIntegers(int number) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter" + number  + " integer values");
		int[] values = new int[number];
		
		for(int i=0;i<values.length;i++) {
			values[i]=scanner.nextInt();
		}
		return values;
		
	}
	
	//method  
	public static double getAverage(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		return (double)sum/array.length;
	}
	
	
	

}



