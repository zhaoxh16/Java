package person;

public class Student extends Person {
	String schoolName;
	public Student(String name, String schoolName){
		super(name);
		this.schoolName = schoolName;
	}
	public String introduceSelf(){
		return "Student";
	}
	public void show(){
		System.out.printf("Name: %s School: %s\n", name,schoolName);
	}

}
