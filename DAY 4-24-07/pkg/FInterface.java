package pkg;
@FunctionalInterface
interface Calculator {
   int operate(int a, int b);//now we cannot have more than one abstract method in functional interface
}
public class FInterface {
	public static void main(String[] args) {
		Calculator add = (a, b) -> a + b;
		System.out.println(add.operate(5, 3));
	}

}
