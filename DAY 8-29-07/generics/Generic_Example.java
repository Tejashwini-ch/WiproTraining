package generics;

class Box<T> {
	private T item;

	public void set(T item) {
		this.item = item;
	}

	public T get() {
		return item;
	}
}

public class Generic_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> intBox=new Box<>();
		intBox.set(100);
		System.out.println("The value of integer is: "+intBox.get());
		// Box for String
        Box<String> strBox = new Box<>();
        strBox.set("Implementing Generics");
        System.out.println("String value: " + strBox.get());
		// Box for Double
		Box<Double> dVar = new Box<>();
		dVar.set(3543.33);
		System.out.println("Double value: "+dVar.get());

	}

}
