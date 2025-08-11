package pkg;
@FunctionalInterface
interface Greet{
	void display();
}
public class LambdaExample {
	public static void main(String[] args) {
		Greet greet=()->System.out.println("Hello this is example of Lamba");
		greet.display();
	}
}
