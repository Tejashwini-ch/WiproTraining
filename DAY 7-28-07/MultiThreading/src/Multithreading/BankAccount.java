package Multithreading;

//Process Synchronization
class BankAccount{
	private int acct_balance = 10000; // user 1 12000
	public synchronized void deposit_amt(int amount){
		acct_balance = acct_balance+amount;
		System.out.println("Amount Deposited: "+amount);
		System.out.println("BalanceAmount: "+acct_balance);
	}

	public synchronized void withdraw_amt(int amount){
		if(acct_balance>=amount){
			acct_balance = acct_balance-amount;			
			System.out.println("Amount Withdrawn: "+amount);
			System.out.println("BalanceAmount: "+acct_balance);
		}
		else{
			System.out.println("Insufficient Balance in your account"+acct_balance);
		}
	}
		public int getBalance(){
			return acct_balance;
		}		
}
