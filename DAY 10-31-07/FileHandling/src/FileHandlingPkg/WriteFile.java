package FileHandlingPkg;

import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
   public static void main(String[] args) {
       try (FileWriter writer = new FileWriter("myfile.txt")) {
          writer.write("Hello, Java File Handling!");
          writer.write("This is the write file");
       } catch (IOException e) {
          e.printStackTrace();
       }
   }
}
