package savingsaccount;

public class SavingsAccount {
	public static void modifyInterestRate(double newRate){
		annualInterestRate = newRate;
	}
	
	public SavingsAccount(double balance){
		_savingsBalance = balance;
	}
	
	public double calculateMonthlyInterest(){
		double newBalance = _savingsBalance*annualInterestRate/12;
		_savingsBalance+=newBalance;
		return newBalance;
	}
	public double getSavingsBalance(){
		return _savingsBalance;
	}
	
	public static double annualInterestRate;//ƒÍ¿˚¬ 
	private double _savingsBalance;//”‡∂Ó
}
