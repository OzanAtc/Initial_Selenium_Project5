import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class _06_Locators_tagName {
    public static void main(String[] args) {

        /*
        1.Go to https://techglobal-training.netlify.app/
        2.Select “Frontend Testing” from the “Practices” dropdown
        3.Select the “Locators” card

        Validate the "Locators" header

        NOTE : Make sure the header is displayed, make sure the text is exactly "Locators"

         */
            try {

                WebDriver driver = Driver.getDriver();

                // 2.action
                driver.get("https://techglobal-training.netlify.app/");
                Waiter.pause(2);

                driver.findElement(By.id("dropdown-button")).click();
                Waiter.pause(2);

                driver.findElement(By.id("frontend-option")).click();
                Waiter.pause(2);

                driver.findElement(By.id("card-1")).click();
                Waiter.pause(5);

                WebElement heading = driver.findElement(By.id("main_heading"));
                if(heading.isDisplayed()) System.out.println("Heading displayed PASSED");
                else System.out.println("Heading text FAILED");

                if(heading.getText().equals("Locators")) System.out.println("Heading text PASSED ");
                else System.out.println("Heading text is FAILED");

            }  catch(Exception e) {
                System.out.println("TEST FAILED due to: " + e.getMessage());
            }
            finally {
                Driver.quitDriver();
            }
    }
}
