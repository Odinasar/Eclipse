
public class Dog2 {

	
		public String name;
		public int age;
		public String breed;
		public String color;
		
		
		public Dog2() {
			
			name="hunter";
			age=15;
			breed="buldog";
			color="brown";
//			System.out.println("default constructor");
		}
		
		public Dog2(String name,int age,String breed,String color) {
			this.name=name;
			this.age=age;
			this.breed=breed;
			this.color=color;
		}
		
		public void bark() {
			System.out.println(name+" is barking");
		}
		
		public void eat() {
			System.out.println(name+" is eating");
		}
		public void waggingTail() {
			System.out.println(name+" is wagging tail");
		}
	

}
