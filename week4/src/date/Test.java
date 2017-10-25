package date;

public class Test {
	public static void main(String args[]){
		Date date1 = new Date("五月","二十四日","二〇一四年");
		Date date2 = new Date("June",14,2014);
		Date date3 = new Date(2015,3,6);
		date1.print1();
		System.out.print('\n');
		date1.print2();
		System.out.print('\n');
		date1.print3();
		System.out.print('\n');
		date2.print1();
		System.out.print('\n');
		date2.print2();
		System.out.print('\n');
		date2.print3();
		System.out.print('\n');
		date3.print1();
		System.out.print('\n');
		date3.print2();
		System.out.print('\n');
		date3.print3();
		System.out.print('\n');
	}
}
