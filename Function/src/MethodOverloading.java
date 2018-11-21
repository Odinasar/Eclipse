
public class MethodOverloading {

	public static void main(String[] args) {
//		int newScore= calcScore("mike",500);
//		System.out.println("New score" + newScore);
//		newScore=calcScore(75);
//		System.out.println(newScore+ " New Score");
//		calcScore();
		
		System.out.println(calcFeetAndInchesToCentimeters(100));
		
		calcFeetAndInchesToCentimeters(156);
		
		calcFeetAndInchesToCentimeters(6,0);
		calcFeetAndInchesToCentimeters(-10,0);
		System.out.println(calcFeetAndInchesToCentimeters(6,6));
		
		

	}
	
	public static int calcScore(String name,int score) {
		System.out.println("Player "+ name+" Score " + score + " points");
		return score*100;
	}
	
	public static int calcScore(int score) {
		System.out.println("Unnamed Player Scored "+ score + " points");
		return score*100;
	}

	public static void calcScore() {
		System.out.println("No player Name ,No Player Score");
//	}
	
	
	public static double calcFeetAndInchesToCentimeters(double Feet,double Inch ) {
	if ((Feet<=0)|(Inch<0&Inch>12)){
		return -1;
	}
	double cm =(Feet*12)*2.54;
	cm=cm+(Inch*2.54);
	System.out.println(Feet+"Feet"+Inch+"Inches"+cm+"Centimiters");
	return cm;
	
	}
	
	
	public static double calcFeetAndInchesToCentimeters(double Inch) {
		if(Inch<0) {
			return -1;
			
		}
		double Feet=(int)Inch/12;
		double remaininginches=(int)Inch%12;
		System.out.println(Inch+" inches= " + Feet+" feet and "+remaininginches+" inches" );
		return calcFeetAndInchesToCentimeters(Feet,remaininginches);
	}
	
}





//public class Task {
//
//	public static void main(String[] args) {
//		
//		calcFeetAndInchesToCentimeters(100);
//	
//
//	}
//	
//	public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
//		
//		if(feet<0 || (inches<0 || inches>12)) {
//			System.out.println("Invalid feet or inches");
//			return -1;
//		}
//		
//		double centimeters = (feet * 12) * 2.54;
//		centimeters += inches * 2.54;
//		
//		System.out.println(feet +" feet, " + inches + "inches=" + centimeters + " centimeters" );
//	
//		
//		return centimeters;
//		
//	}  
//	
//	public static double calcFeetAndInchesToCentimeters(double inches) {
//		
//		if(inches<0) {
//			return -1;
//		}
//		
//		double feet = (int)inches / 12 ;
//		double remainingInches = (int)inches % 12;
//		
//		System.out.println(inches  + " inches=" + feet + " feet and " + remainingInches + " inches");
//		return calcFeetAndInchesToCentimeters(feet, remainingInches);
//	}
//	
//	
//	
//	
//
//}
