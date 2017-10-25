package student;

public class Graduate extends Student {
	public String direction;
	public Graduate(){
		direction = "";
	}
	public Graduate(String name, int age, String direction){
		super(name,age,"Graduate");
		this.direction = direction;
	}
	public void show(){
		System.out.printf("name:%s age:%d degree:%s direction:%s\n",name,age,degree,direction);
	}
}
