package person;

public class Retired extends Person {
	int retiredYear;
	public Retired(String name, int retiredYear){
		super(name);
		this.retiredYear = retiredYear;
	}
	public String introduceSelf(){
		return "Retired";
	}
	public void show(){
		System.out.printf("Name: %s Retired: %d\n", name,retiredYear);
	}
}
