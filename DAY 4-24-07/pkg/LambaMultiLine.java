package pkg;

@FunctionalInterface
interface Greeting {
	void display();
}

public class LambaMultiLine {
	public static void main(String[] args) {
		Greeting greeting = () -> {
			System.out.println("Hello");
			System.out.println("This is a multiline lambda expression");
		};
		greeting.display();
	}

}
