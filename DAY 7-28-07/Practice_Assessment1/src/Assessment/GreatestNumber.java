package Assessment;

public class GreatestNumber {
	int[] number=new int[10];
	public GreatestNumber(int[] number) {
		this.number=number;
	}
	public void checkGreatest(){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<number.length;i++) {
			if(number[i]>max) {
				max=number[i];
			}
		}
		System.out.println("The greatest number of given numbers is: "+max);
	}

}
