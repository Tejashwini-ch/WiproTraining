package pkg_excepton_handling;

public class Thro_Throws {
	public static void checkAge(int age) throws IllegalArgumentException//we use throws exception here in method declaration
	{
		if(age<18) {
			throw new IllegalArgumentException("Access denied");
		}
		else {
			System.out.println("Access granted-You are eligible to vote");
		}
	}
	public static void main(String[] args) {
		try {
			checkAge(16);
		}catch(IllegalArgumentException e) {
			System.out.println("Exception caught: "+e.getMessage());
		}
		System.out.println("program continues...");
	}

}

