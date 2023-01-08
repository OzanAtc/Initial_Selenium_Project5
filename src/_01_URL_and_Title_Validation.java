import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_URL_and_Title_Validation {
    public static void main(String[] args) throws InterruptedException {

        // 1.Set up

        System.setProperty("webdriver.chromedriver", "\"/Users/ozge/IdeaProjects/initial_selenium_project_5/chromedriver\"");

         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();

         // 2. Test Validation
        driver.get("https://www.techglobalschool.com/"); // no caches.. cach - is navigation history(that is kept)
        driver.navigate().to("https://www.techglobalschool.com/"); // keep caches
        Thread.sleep(2000);
        driver.navigate().refresh();

        if(driver.getTitle().equals("SDET Bootcamp | TechGlobal")) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");

        if(driver.getCurrentUrl().equals("https://www.techglobalschool.com/")) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");


        // 3. Teardown

        driver.quit();
    }
}
