
public class Main {

	public static void main(String[] args) {
		
		Engine e1=new Engine();


		//Honda h1=new Honda("Red",250,e1);
		Honda h1=new Honda("Red",250,new Engine());
		h1.CarInfo();
		h1.startHonda();

	}

}
