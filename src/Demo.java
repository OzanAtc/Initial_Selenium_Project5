import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/ozge/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver(); // Instantiating ChromeDriver

        driver.manage().window().fullscreen();
        driver.get("https://www.google.com/"); // Navigate to our URL

        String title = driver.getTitle();
        System.out.println(title);

        driver.quit(); // Quit the driver instance

    }
}
