import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ExampleOzan {
    public static void main(String[] args) throws InterruptedException {

            /*
             /*
        TEST CASE 1
Go to https://techglobal-training.netlify.app/
Validate the address in the footer is displayed and text is "2860 S River Rd Suite 350, Des Plaines IL 60018"
Validate the copyright in the footer is displayed and text is "© 2023 TechGlobal - All Rights Reserved"
         */


        System.setProperty("webdriver.chromedriver", "/Users/ozge/IdeaProjects/initial_selenium_project_5");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://techglobal-training.netlify.app/");

        List<WebElement> elements = driver.findElements(By.xpath("//footer[@class='Footer_footer__kXlYa']//p"));

        String[] actualText = {"2860 S River Rd Suite 350, Des Plaines IL 60018", "© 2023 TechGlobal - All Rights Reserved"};

        for (int i = 0; i < elements.size(); i++) {
            if(elements.get(i).getText().equals(actualText[i])) System.out.println("Footer text matches");
            else System.out.println("Footer text does not match");
        }

        driver.quit();

    }
}
