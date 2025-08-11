package FileHandlingPkg;

//Serialize This Object for step1
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
 
public class SerializeUser {
   public static void main(String[] args) throws Exception {
       User user = new User("alice", "alice@example.com",18);
       ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"));
       out.writeObject(user);
       System.out.println(user);
       out.close();
   }
}

