package student;

public class Student {
	public String name;
	public int age;
	public String degree;
	public Student(){
		this.name = "";
		this.age = -1;
		this.degree = "";
	}
	public Student(String name,int age,String degree){
		this.name = name;
		this.age = age;
		this.degree = degree;
	}
	public void show(){
		System.out.printf("name:%s age:%d degree:%s\n",name,age,degree);
	}
}
