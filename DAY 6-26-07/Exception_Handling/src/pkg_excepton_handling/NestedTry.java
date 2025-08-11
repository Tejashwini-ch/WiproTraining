package pkg_excepton_handling;
public class NestedTry {
	public static void main(String[] args) {
		int[] numbers= {100,0};
		try {
			System.out.println("Outer try block");
			try {
				System.out.println("Inner try block");
				int result=numbers[0]/numbers[1];
				System.out.println("Result is: "+result);//gives output 5 when numbers[1]=20
			}catch(ArithmeticException e) {
				System.out.println("Arithmetic exception has been occured");
			}
            int value = numbers[2];  
            System.out.println("Value is: "+value);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("It gives exception as array index out of bound exception");
			
		}
	}

}
