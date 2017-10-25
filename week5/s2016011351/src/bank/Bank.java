package bank;

public class Bank {
	protected double oneyearRate = 0.0178;
	protected double oneyearNationaldebt = 0.0198;
	protected double interestRate = 0.0078;
	protected double total = 0;
	public Bank(double total){
		this.total = total;
	}
	public void count(){}
	public void show(){
		System.out.printf("Total: %f\n",total);
	}
}
