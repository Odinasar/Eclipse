package homeWork;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a JAVA program to calculate the tax:
//
//			income ≤ 150,000,000 tax ratio %25
//			income ≤ 300,000,000 tax ratio %30
//			income ≤ 600,000,000 tax ratio %35
//			income ≤ 1,200,000,000 tax ratio %40
//			income > 1,200,000,000 tax ratio %50
//
//			Create needed variables and print the tax 
//		
		 double income = 20_000_000;
		if (income<=150_000_000){
		System.out.println(income*0.25);
		}else if(income <= 300_000_000){
		System.out.println(income*0.30);		
		}else if(income <= 600_000_000){
			System.out.println(income*0.35);		
		}else if(income <= 1_200_000_000){
			System.out.println(income*0.40);		
			}else if(income > 1_200_000_000){
				System.out.println(income*0.50);		
			}
		

	}

}
