package pkg;

@FunctionalInterface
interface MathOperationReturn {
	double operate(double a, double b);
}

public class LambdaMathOperationReturn {
	public static void main(String[] args) {
		// Lambda expressions with return statements
		MathOperationReturn add = (a, b) -> {
			return a + b;
		};
		MathOperationReturn subtract = (a, b) -> {
			return a - b;
		};
		MathOperationReturn multiply = (a, b) -> {
			return a * b;
		};
		MathOperationReturn divide = (a, b) -> {
			if (b == 0) {
				System.out.println("Cannot divide by zero");
				return 0;
			}
			return a / b;
		};

		double x = 100, y = 0;

		System.out.println("Addition: " + add.operate(x, y));
		System.out.println("Subtraction: " + subtract.operate(x, y));
		System.out.println("Multiplication: " + multiply.operate(x, y));
		System.out.println("Division: " + divide.operate(x, y));
	}

}
