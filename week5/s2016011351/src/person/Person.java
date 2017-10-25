package person;

public class Person {
	public String name;
	public Person(String name){
		this.name = name;
	}
	public String introduceSelf(){
		return "Person";
	}
	public void show(){
		System.out.printf("Name: %s\n",name);
	}
}
