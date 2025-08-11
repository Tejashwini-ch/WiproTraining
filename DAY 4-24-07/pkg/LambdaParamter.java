package pkg;
@FunctionalInterface
interface Sum{
	int sum(int a, int b);
}
public class LambdaParamter {
	public static void main(String[] args) {
		Sum add=(a,b)-> a+b;
		System.out.println("The addition using lambda expression is: "+add.sum(5,4));
	}

}
