package Assessment;

public class PrimeNumber {
	int number;
	public PrimeNumber(int number){
		this.number=number;
	}
	public void checkPrime() {
		if(number<2) {
			System.out.println("The given number "+number+" not a rime number");
			return;
		}
		for(int i=2;i<number;i++)
		{
			if(number%i==0) {
				System.out.println("The given number "+number+" is not a prime number");
				return;//if you keep return it will print the statement which is after the loop
			}
		}
		System.out.println("The given number "+number+" is a prime number");
	}

}
