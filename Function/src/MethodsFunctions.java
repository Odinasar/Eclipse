
public class MethodsFunctions {

	public static void main(String[] args) {
//		calculateSum(5,5);
//		System.out.println(calculateSum2(5,10));
		int position=calculateHighScorePosition(1500);
		displayHighScorePosition("John",position);
		
		 position=calculateHighScorePosition(900);
		displayHighScorePosition("MIKE",position);
		
		position=calculateHighScorePosition(90);
		displayHighScorePosition("EDDY",position);
		
		
		position=calculateHighScorePosition(200);
		displayHighScorePosition("KUZAT",position);
		
		displayHighScorePosition("OZZY",calculateHighScorePosition(190));
		
		
		
		
	}
	
//	public static void calculateSum(int a,int b) {
//		
//		int sum=a+b;
//		System.out.println(sum);
//	}
//	
//	
//	public static int calculateSum2(int x,int y) {
//		
//		int sum=x+y;
//		return sum;
//		
//	}	
	
	
	public static void  displayHighScorePosition(String name,int position) {
	 System.out.println(name +" manage to get into position" + position+ " " +"on the high score table" );
	
}
	
	public static int calculateHighScorePosition(int score) {
		
		if(score>=1000) {
			return 1;
			
		}else if(score>=500&score<1000) {
			return 2;
		}else if(score>=100&score<500) {
			return 3;
	}else {
		return 4;
	}

	
}
}