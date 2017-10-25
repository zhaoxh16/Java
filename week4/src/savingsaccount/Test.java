package savingsaccount;

public class Test {
	public static void main(String args[]){
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		SavingsAccount.annualInterestRate = 0.04;
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println(saver1.getSavingsBalance());
		System.out.println(saver2.getSavingsBalance());
		SavingsAccount.annualInterestRate = 0.05;
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println(saver1.getSavingsBalance());
		System.out.println(saver2.getSavingsBalance());
	}

}
