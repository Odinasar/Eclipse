
public class Main {

	public static void main(String[] args) {
		
//		Deskphone mikePhone=new Deskphone(41060341, true);
		
		iTelephone mikePhone= new Deskphone(234234, true);
		mikePhone.powerOn();
		mikePhone.answer();
		mikePhone.callPhone(234234);
		
	}

}
