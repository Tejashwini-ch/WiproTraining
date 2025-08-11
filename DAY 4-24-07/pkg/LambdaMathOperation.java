package pkg;

@FunctionalInterface
interface MathOperation {
	double operate(double a, double b);
}

public class LambdaMathOperation {
	public static void main(String[] args) {
		// Step 2: Define lambda expressions for each operation
		MathOperation add = (a, b) -> a + b;
		MathOperation subtract = (a, b) -> a - b;
		MathOperation multiply = (a, b) -> a * b;
		MathOperation divide = (a, b) -> {
			if (b == 0) {
				System.out.println("Cannot divide by zero");
				return 0;
			}
			return a / b;
		};
		// Step 3: Use the lambdas
		double x = 100, y = 50;
		System.out.println("Addition: " + add.operate(x, y));
		System.out.println("Subtraction: " + subtract.operate(x, y));
		System.out.println("Multiplication: " + multiply.operate(x, y));
		System.out.println("Division: " + divide.operate(x, y));
	}

}
