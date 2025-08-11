package Assessment;

public class SwapNumber {
	int num1;
	int num2;
	public SwapNumber(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public void swappingNumbers(){
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Swapping of two numbers: "+num1+", "+num2);
		
	}

}
