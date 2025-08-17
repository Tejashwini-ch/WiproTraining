package tests;
import org.openqa.selenium.Alert; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.EmployeeFormPage;
 
public class EmployeeFormTest {
   public static void main(String[] args) {
       //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
       WebDriver driver = new ChromeDriver();
 
      
try {
          driver.get("file:///D:/WiproTraining/DAY%2024/EmployeeForm/index.html");
 
           // Step 1: Initialize the Page Object
           EmployeeFormPage formPage = new EmployeeFormPage(driver);
 
           // Step 2: Use page methods
          formPage.enterEmpId("101");
          formPage.enterEmpName("Harry");
          formPage.enterDOB("2001-01-11");
          formPage.enterAddress("123 ABC");
          formPage.enterContactNo("7777777777");
          formPage.enterEmail("harry@example.com");
          formPage.clickSubmit();

          // Step 4: Handle alert
          Alert alert = driver.switchTo().alert();
          String alertMessage = alert.getText();
          System.out.println("Alert message: " + alertMessage);
          alert.accept();

          Thread.sleep(1000); 
           // Wait and validate
//           Thread.sleep(1000);
//           String message = formPage.getConfirmationMessage();
//           if (message != null) {
//              System.out.println("Success: " + message);
//           } else {
//              System.out.println("Submission failed or message not shown.");
//           }
 
       } catch (Exception e) {
          e.printStackTrace();
       } finally {
          driver.quit();
       }
   }
}

