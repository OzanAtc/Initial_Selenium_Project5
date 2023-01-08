import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Driver_Navigation {
    public static void main(String[] args) throws InterruptedException {

        /*
        TEST CASE

         */

        System.setProperty("webdriver.chromedriver", "/Users/ozge/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.techglobalschool.com/");
        driver.navigate().refresh();

        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        if(driver.getCurrentUrl().equals("https://www.amazon.com/")) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");

        if(driver.getTitle().equals("Amazon.com. Spend less. Smile more.")) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");

        driver.quit();
    }
}
