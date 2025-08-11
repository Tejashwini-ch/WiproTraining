package Multithreading;

public class BankAccountPractice {
	private int acct_balance = 1000; // initial amount 
	//synchronized method to withdraw the money
	public synchronized void withdraw_amt(int amount,String user) {
		if (acct_balance >= amount) {
			acct_balance = acct_balance - amount;
			System.out.println(user+ " has withdrew amount: " + amount);
			System.out.println("BalanceAmount: " + acct_balance);
		} else {
			System.out.println("Insufficient Balance in your account" + acct_balance);
		}
	}

	public int getBalance() {
		return acct_balance;
	}

}
