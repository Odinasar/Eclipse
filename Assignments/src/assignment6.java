
public class assignment6 {

	public static void main(String[] args) {
		
System.out.println(teen(9, 99, 19));//true
System.out.println(teen(23, 15, 42));//true
System.out.println(teen(22, 23, 34));//false
	}

	public static boolean teen(int num1,int num2,int num3) {
		if((num1>=13&num1<=19)|(num2>=13&num2<=19)|(num3>=13&num3<=19)) {
			return true;
			
		}else {
			return false;
		}
	}
}
