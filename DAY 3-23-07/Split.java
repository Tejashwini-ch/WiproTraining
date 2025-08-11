package pkg;

public class Split {
	public static void main(String[] args) {
		String cars = "Audi,BMW,Mercedez,Range Rover";
		String[] favcars = cars.split(",");
		for (String mycars : favcars) {
			System.out.println(mycars);
		}
	}

}
