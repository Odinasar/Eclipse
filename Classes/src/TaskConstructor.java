
public class TaskConstructor {

	public String name;
	public int  age; 
	public int  year;
	public String gender;
	public String course;
	public static String university="Cybertek";
	
	
	
	public TaskConstructor(String name, int age, int year, String gender, String course) {
		
		this.name = name;
		this.age = age;
		this.year = year;
		this.gender = gender;
		this.course = course;
		
	}


	public void attendLecture() {
		System.out.println(name +" is attending the lecture at "+ university + " and taking course "+course);
	}
	public void submitAssignment() {
		System.out.println(name + " submitting assignment" +" at "+ university);
	}

}
