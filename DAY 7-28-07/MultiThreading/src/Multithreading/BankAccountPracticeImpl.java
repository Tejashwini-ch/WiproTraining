package Multithreading;

public class BankAccountPracticeImpl {
	public static void main(String[] args){
		BankAccountPractice  bankAccount = new BankAccountPractice();
		Thread t1 =new Thread(
				()-> {
					for(int i=1;i<5;i++){
						bankAccount.withdraw_amt(100,"user1");
					try{
						Thread.sleep(500);
					}catch(InterruptedException ie){
						ie.printStackTrace();	
					}
					}				
				});
		Thread t2 =new Thread(
		()-> {
			for(int i=1;i<5;i++){
				bankAccount.withdraw_amt(200,"user2");
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){
				ie.printStackTrace();	
			}
			}				
		});
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException ie){
				ie.printStackTrace();	
		}
	System.out.println("Balance Left: "+bankAccount.getBalance());
	}

}
