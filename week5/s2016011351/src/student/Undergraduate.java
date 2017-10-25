package student;

public class Undergraduate extends Student {
	public String specialty;
	public Undergraduate(){
		specialty = "";
	}
	public Undergraduate(String name,int age, String specialty){
		super(name,age,"Undergraduate");
		this.specialty = specialty;
	}
	public void show(){
		System.out.printf("name:%s age:%d degree:%s specialty:%s\n",name,age,degree,specialty);
	}
}
