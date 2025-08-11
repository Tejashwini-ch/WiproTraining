package Assessment;

public class Factorial {
	int number;
	public Factorial(int number) {
		this.number=number;
	}
	public void factorial_number() {
		int result=1;
		for(int i=1;i<=number;i++) {
			result*=i;
		}
		System.out.println("The factorial of "+number+" is: "+result);
	}
	

}
