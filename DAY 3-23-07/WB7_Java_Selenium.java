package pkg;
class Car{
	//class variables or instance variables
	private String model;
	private int make_year;
	//Constructor
	Car(String model, int make_year){
		this.model=model;
		this.make_year=make_year;
	}
	public void printDetails() {
		System.out.println("Model of the car is: "+model);
		System.out.println("Year: "+make_year);
		}
}

public class WB7_Java_Selenium {
	public static void main(String[] args)
	{
		Car car=new Car("Benz",2000);
		car.printDetails();
	}
}
