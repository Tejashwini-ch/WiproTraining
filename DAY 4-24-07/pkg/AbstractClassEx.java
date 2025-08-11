package pkg;
//Abstract class
//We cannot instantiate the object of an abstract class.
abstract class Animal1 {
	//Constructor
	Animal1(){
		System.out.println("Abstract class Constructor");
	}
	//abstract method
	abstract void sound();  // Abstract method
 
//concrete method
	void sleep() {  // Concrete method
     System.out.println("Sleeping...");
}
	//Fields
	static int abs_var;
}
 
//Subclass that provides implementation
class Dog1 extends Animal1 {
Dog1(){
	 //This has to be the 1st statement in child class Constructor.
	 super();
	 System.out.println("Dog class Constructor...");
}
	void sleep() {
		super.sleep();
		System.out.println("Dog is sleeping");
	}
	void sound() {
     System.out.println("Dog barks");
}
}
 
 
class AbstractClassEx {
public static void main(String[] args) {
     Dog1 myDog = new Dog1();
     myDog.sound();  // Outputs: Dog barks
     myDog.sleep();  // Outputs: Sleeping...
     myDog.abs_var=1001;
     System.out.println("Variable in an abstract class: "+myDog.abs_var);
}
}