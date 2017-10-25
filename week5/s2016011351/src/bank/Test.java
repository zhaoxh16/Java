package bank;

public class Test {
	public static void main(String args[]){
		Bank a = new OneyearRateAccount(1000);
		Bank b = new OneyearNationaldebtAccount(123.45);
		Bank c = new InterestAccount(99999.9);
		a.count();
		b.count();
		c.count();
		a.show();
		b.show();
		c.show();
	}
}
