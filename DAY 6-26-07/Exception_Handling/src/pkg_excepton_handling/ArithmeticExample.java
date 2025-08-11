package pkg_excepton_handling;
import java.util.Scanner;
public class ArithmeticExample {
	public static void main(String[]args) {
		int num,den,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numerator: ");
		num=sc.nextInt();
		System.out.println("Enter the denominator: ");
		den=sc.nextInt();
		try {
			//if we give array here it give array index out of bound exception
			int[] arr=new int[4];
			arr[5]=343;//- Once an exception is thrown, control moves immediately to the matching catch block.

			result=num/den;
			System.out.println("Result is: "+result);
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by number Zero");
			e.printStackTrace();//it gives where we get the error
			//It will be shown when we print object e and
			//it will show what is the exception and by what value we will get exception.
			//Object: java.lang.ArithmeticException: / by zero
			
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("It provides array index out of bound exception");
		}
		finally {
			System.out.println("It will execute no matter exception occur or not");
		}
		
		
		
	}

}

