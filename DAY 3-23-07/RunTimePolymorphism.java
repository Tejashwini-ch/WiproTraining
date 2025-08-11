package pkg;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
 
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
 
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
public class RunTimePolymorphism {
	    public static void main(String[] args) {
	        Animal a; // reference of superclass
			a = new Dog();
	        a.sound(); // Output: Dog barks
	 
	        a = new Cat();
	        a.sound(); // Output: Cat meows
	    }
	

}
