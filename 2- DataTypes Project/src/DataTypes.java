
public class DataTypes {

	public static void main(String[] args) {
		// byte
		byte b1=25;
		byte b2=-128;
		byte b3=127;  // byte between -127 and 128;
		System.out.println(b1+" "+b2+" "+b3);
		//byte b4=128  out of range
		
		System.out.println("----------------");
		
		
		//short
		short s1=500; //short between -32678 and 32767
		short s2=-32768;
		short s3=32767;
		//short s4=32768; out of range
		System.out.println(s1+"|"+s2+"|"+s3 );
		
		
		System.out.println("----------------");
		
		//int
		int i1=-50_000;
		int i2=100_000;
		int i3=500_000000;
		System.out.println(i1+"|"+i2+"|"+i3);
		
		System.out.println("----------------");
		
		
		//long
		long l1=1000000000000000L;
		long l2=214_783_949_031L;
		System.out.println(l1+"|"+l2);
		
		System.out.println("----------------");
		
		
		
		//float: floating point types have double as a default type
		float f1=5.2f;
		double d1=5.2;
		System.out.println(f1+"|"+d1);
		
		
		//boolean
		boolean bool =true;
		boolean bool1=false;
		
		//char
		char c1='D';
		char c2='2';
		char c3='@';
		
		char c4='\u00A9';
		char c5 ='\u03BB';
				System.out.println(c4+"|"+c5);
		
		
		
		
	}

}
