package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
public class EmployeeFormPage {
   WebDriver driver;
 
   // Constructor
   public EmployeeFormPage(WebDriver driver) {
       this.driver = driver;
   }
 
   // Locators
   By empIdField = By.id("empId");
   By empNameField = By.id("empName");
   By dobField = By.id("empDob");
   By addressField = By.id("empAddress");
   By contactNoField = By.id("empMobile");
   By emailField = By.id("empEmail");
   By submitButton = By.cssSelector("button[type='submit']");
   //By messageText = By.id("output");
 
   // Actions
   public void enterEmpId(String empId) {
      driver.findElement(empIdField).sendKeys(empId);
   }
 
   public void enterEmpName(String empName) {
      driver.findElement(empNameField).sendKeys(empName);
   }
 
   public void enterDOB(String dob) {
      driver.findElement(dobField).sendKeys(dob);
   }
 
   public void enterAddress(String address) {
      driver.findElement(addressField).sendKeys(address);
   }
 
   public void enterContactNo(String contactNo) {
      driver.findElement(contactNoField).sendKeys(contactNo);
   }
 
   public void enterEmail(String email) {
      driver.findElement(emailField).sendKeys(email);
   }
 
   public void clickSubmit() {
      driver.findElement(submitButton).click();
   }
 
//   public String getConfirmationMessage() {
//       WebElement message = driver.findElement(messageText);
//       return message.isDisplayed() ? message.getText() : null;
//   }
}

