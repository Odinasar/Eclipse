
public class StudentClass {

	public String name;
	public int age;
	public String gender;
	public int year;
	public String course;
	public String university;
	
	public StudentClass(String name,int age,String gender,int year,String course,String university) {
	
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.year=year;
		this.course=course;
		this.university=university;
		
		
		
	}
	public void attendLecture(){
		System.out.println("attendLecture, ");
	}
	public void submitAssignment() {
		System.out.println("submitAssignment, ");
	}
	public void attendLab() {
		System.out.println("attendLab");
	}

	}

