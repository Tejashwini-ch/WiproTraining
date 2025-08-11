package pkg;

class MathUtils {
	// Method with 1 int parameter
	int add(int a) {
		return a + 0;
	}

	// Method with 2 int parameters
	int add(int a, int b) {
		return a + b;
	}

	// Method with 3 int parameters
	int add(int a, int b, int c) {
		return a + b + c;
	}
	/*
	 * double add(double a, double b, doublec){
	 * return a*b*c----it give output when we provide double value in object like mu.add(1.0,2.0,3.0)
	 * 
	 * if it is
	 * double add(int a, int b, int c){ a+b+c}
	 * It provides no ouput becoz the jvm gets confused between above int(3variables) 
	 * add method and this double add(int variables(3))method.
	 * so We have to provide values correctly.
	 * 
	 */
}

public class CompileTimePolymorphism {
	public static void main(String[] args) {
		MathUtils mu = new MathUtils();
		System.out.println(mu.add(5)); // Output: 5
		System.out.println(mu.add(5, 10)); // Output: 15
		System.out.println(mu.add(5, 10, 15)); // Output: 30
	}

}
