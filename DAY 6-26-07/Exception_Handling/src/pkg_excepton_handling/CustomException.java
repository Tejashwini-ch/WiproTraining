package pkg_excepton_handling;

class InvalidAgeException extends Exception {

 // Default constructor

 public InvalidAgeException() {

     super("Invalid age provided");

 }

 // Constructor with custom message

 public InvalidAgeException(String message) {

     super(message);

 }

}

class AgeValidator {

 public void validate(int age) throws InvalidAgeException {

     if (age < 18) {

         throw new InvalidAgeException("Age must be at least 18 to cast a vote!!!!");

     }

 }

 public static void main(String[] args) {

     AgeValidator validator = new AgeValidator();

     try {

         validator.validate(16);

     } catch (InvalidAgeException e) {

         System.out.println("Caught exception: " + e.getMessage());

     }

 }

}



