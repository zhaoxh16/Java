package bank;

public class OneyearNationaldebtAccount extends Bank {
	public OneyearNationaldebtAccount(double total){
		super(total);
	}
	public void count(){
		total *= (1+oneyearNationaldebt);
	}
}
