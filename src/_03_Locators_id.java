import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Locators_id {
    public static void main(String[] args) throws InterruptedException {

        /*
TEST CASE :
Go to https://techglobal-training.netlify.app/
Validate the company logo is displayed

         */

        // 1.Set up - before actions
        System.setProperty("webdriver.chromedriver", "\"/Users/ozge/IdeaProjects/initial_selenium_project_5/chromedriver\"");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2.Validation - action
        driver.get("https://techglobal-training.netlify.app/");
        Thread.sleep(2000);

        // Locate the logo and validate it
        WebElement logo = driver.findElement(By.id("logo"));

        if(logo.isDisplayed()) System.out.println("Logo validation PASSED");
        else System.out.println("Logo validation FAILED");
        // 3.Teardown - after actions
        driver.quit();

    }
}
