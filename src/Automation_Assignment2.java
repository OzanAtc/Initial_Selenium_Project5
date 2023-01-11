import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class Automation_Assignment2 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement fNameInput= driver.findElement(By.id("input_comp-khwayxk9"));
        WebElement lNameInput = driver.findElement(By.id("input_comp-khwaz4h2"));
        WebElement emailInput = driver.findElement(By.id("input_comp-khwb0zsz"));


        fNameInput.sendKeys("John");
        Waiter.pause(2);
        lNameInput.sendKeys("Doe");
        Waiter.pause(2);
        emailInput.sendKeys("john.doe@gmail.com");
        Waiter.pause(2);


        System.out.println(fNameInput.getAttribute("value").equals("John"));

        Waiter.pause(2);
        System.out.println(lNameInput.getAttribute("value").equals("Doe"));

        Waiter.pause(2);
        System.out.println(emailInput.getAttribute("value").equals("john.doe@gmail.com"));

        Driver.quitDriver();
    }
}

