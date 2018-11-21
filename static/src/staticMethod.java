
public class staticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abc.show1();
		abc.show4();
		
		
		abc x =new abc();
		x.show2();
		x.show3();
	}

	
	
	
}


class abc{
	public static void show1() {
		System.out.println("hi");
		show4();
		show2();// instance method cant be called inside static
		
	}
	
	
	public void show2() {
		System.out.println("hi");
		show1();
		show4(); // inside instance method we can call static method;
		}
	
	
	
	public void show3() {
		System.out.println("hi");
		show2();
		}
	
	
	public static void show4() {
		System.out.println("hi");
		
		}
}