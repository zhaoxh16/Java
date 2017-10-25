package person;

public class Employee extends Person {
	String firmName;
	public Employee(String name, String firmName){
		super(name);
		this.firmName = firmName;
	}
	public String introduceSelf(){
		return "Employee";
	}
	public void show(){
		System.out.printf("Name: %s Firm: %s\n", name,firmName);
	}
}
