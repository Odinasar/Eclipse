
public class Assignment3 {

	public static void main(String[] args) {
		
		System.out.println(bark(true,1));//true
		System.out.println(bark(false,2));//false
		System.out.println(bark(true,8));//false
		System.out.println(bark(true,-1));//false

	}
	
	public static boolean bark(boolean barking,int hourOfDay) {
	
		
		
	if (hourOfDay<0||hourOfDay>23){
		return false;
	
	}else if ((barking)&(hourOfDay<=22 & hourOfDay<8)){ 
		return true;
	}else {
		return false;
	}
	

}
}