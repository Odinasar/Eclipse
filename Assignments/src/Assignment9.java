
public class Assignment9 {

	public static void main(String[] args) {
		
        System.out.println(area(5.0));
		System.out.println(area(-1));
		System.out.println(area(5.0,4.0));
		System.out.println(area(-1.0,4.0));
	}

	
	
	public static double area(double radius) {
		double r=-1.0;
		if (radius<0) {
			 
			 return r;
		
			 
		}else {
			radius=radius*radius*3.14159;
			return radius;
		}
		
		
	}
	
	public static double area(double x,double y) {
		double a=-1;
		double b;
		if(x<0|y<0) {
			
			return a;
		
		}else {
			b=x*y;
			return b;
		}
		
		
		
	}
	
	
	
	
}
