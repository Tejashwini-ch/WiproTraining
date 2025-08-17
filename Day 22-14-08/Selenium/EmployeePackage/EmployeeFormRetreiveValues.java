package EmployeePackage;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
 
import java.util.List;
 
public class EmployeeFormRetreiveValues {

    public static void main(String[] args) {
 
        // Set up WebDriver

    	System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jar files\\\\chromedriver.exe"); 


        WebDriver driver = new ChromeDriver();
 
        try {

             // 1. Open target website--it will open zomato

            driver.get("file:///D:/WiproTraining/DAY%2024/EmployeeForm/index.html");

            driver.manage().window().maximize();
 
            // 2. Extract all links--it will give all links that are there in the website.

            List<WebElement> allLinks = driver.findElements(By.tagName("a"));

            System.out.println("Links:");

            for (WebElement link : allLinks) {

                System.out.println(link.getText() + " -> " + link.getAttribute("href"));

            }
 
            // 3. Extract all input fields

            List<WebElement> allInputs = driver.findElements(By.tagName("input"));

            System.out.println("Input Fields:");

            for (WebElement input : allInputs) {

                System.out.println("Type: " + input.getAttribute("type") + " | Placeholder: " + input.getAttribute("placeholder"));

            }
 
            // 4. Extract all buttons

            List<WebElement> allButtons = driver.findElements(By.tagName("button"));

            System.out.println("Buttons:");

            for (WebElement button : allButtons) {

                System.out.println("Text: " + button.getText());

            }
         // 5. Retrieve values from specific fields
            // Assuming your HTML form has these IDs: empId, empName, empEmail
            Thread.sleep(15000);
            WebElement empIdInput = driver.findElement(By.name("empId"));
            WebElement empNameInput = driver.findElement(By.name("empName"));
            WebElement empEmailInput = driver.findElement(By.name("empEmail"));
            WebElement empDobInput = driver.findElement(By.name("empDob"));
            WebElement empAddressInput = driver.findElement(By.name("empAddress"));
            WebElement empMobileInput = driver.findElement(By.name("empMobile"));

            String empIdValue = empIdInput.getAttribute("value");
            String empNameValue = empNameInput.getAttribute("value");
            String empEmailValue = empEmailInput.getAttribute("value");
            String empDobValue = empDobInput.getAttribute("value");
            String empAddressValue = empAddressInput.getAttribute("value");
            String empMobileValue = empMobileInput.getAttribute("value");

            System.out.println("\nRetrieved Values from Form:");
            System.out.println("Employee ID: " + empIdValue);
            System.out.println("Employee Name: " + empNameValue);
            System.out.println("Employee Email: " + empEmailValue);
            System.out.println("Date of Birth: " + empDobValue);
            System.out.println("Address: " + empAddressValue);
            System.out.println("Mobile No: " + empMobileValue);

 
            // 6. Extract all headings (h1–h6)

            System.out.println("Headings:");

            for (int i = 1; i <= 6; i++) {

                List<WebElement> headings = driver.findElements(By.tagName("h" + i));

                for (WebElement heading : headings) {

                    System.out.println("H" + i + ": " + heading.getText());

                }

            }
 
            // 7. Extract all paragraphs

            List<WebElement> allParagraphs = driver.findElements(By.tagName("p"));

            System.out.println("Paragraphs:");

            for (WebElement para : allParagraphs) {

                System.out.println(para.getText());

            }
 
        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            // 7. Close browser

            //driver.quit();

        }

    }

}

 