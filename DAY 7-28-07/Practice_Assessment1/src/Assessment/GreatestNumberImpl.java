package Assessment;
import java.util.*;
public class GreatestNumberImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter the values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		GreatestNumber maxNumber=new GreatestNumber(arr);
		maxNumber.checkGreatest();
		

	}

}
