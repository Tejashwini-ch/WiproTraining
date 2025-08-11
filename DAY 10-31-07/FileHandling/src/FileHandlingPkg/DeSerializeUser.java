package FileHandlingPkg;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DeSerializeUser {
   public static void main(String[] args) throws Exception {
	   ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"));
       User user = (User)in.readObject();  // This will fail
       in.close();

   }
}

/*it is giving error
This Error:
java.io.InvalidClassException: User; local class incompatible:
stream classdesc serialVersionUID = [old], local class serialVersionUID = [new]
-----------------------------------------
to remove the error add serialversion id
Solution: Add serialVersionUID in the user file not here.
To maintain compatibility between versions, manually define a serialVersionUID:
*/