package bank;

public class InterestAccount extends Bank {
	public InterestAccount(double total){
		super(total);
	}
	public void count(){
		total *= (1+interestRate);
	}
}
