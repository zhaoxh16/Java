package bank;

public class OneyearRateAccount extends Bank {
	public OneyearRateAccount(double total){
		super(total);
	}
	public void count(){
		total *= (1+oneyearRate);
	}
}
