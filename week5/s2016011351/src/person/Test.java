package person;

public class Test {
	public static void main(String args[]){
		//Part1: 单一对象
		Person a = new Person("A");
		Person b = new Employee("B","Tencent");
		Person c = new Retired("C",2010);
		Person d = new Student("D", "Tsinghua University");
		System.out.println("a: "+a.introduceSelf());
		a.show();
		System.out.println("b: "+b.introduceSelf());
		b.show();
		System.out.println("c: "+c.introduceSelf());
		c.show();
		System.out.println("d: "+d.introduceSelf());
		d.show();
		
		//Part2: 数组化
		Person[] personArray = new Person[4];
		personArray[0] = new Person("E");
		personArray[1] = new Employee("F","Baidu");
		personArray[2] = new Retired("G", 2008);
		personArray[3] = new Student("H", "Peking University");
		System.out.println("personArray[0]: "+personArray[0].introduceSelf());
		personArray[0].show();
		System.out.println("personArray[1]: "+personArray[1].introduceSelf());
		personArray[1].show();
		System.out.println("personArray[2]: "+personArray[2].introduceSelf());
		personArray[2].show();
		System.out.println("personArray[3]: "+personArray[3].introduceSelf());
		personArray[3].show();
		
		//Part3: 参数化
		setName(a,"I");
		a.show();
		setName(b,"J");
		b.show();
		setName(c,"K");
		c.show();
		setName(d,"L");
		d.show();
		
	}
	
	public static void setName(Person person, String newName){
		person.name = newName;
	}
}
