import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Waiter;

import java.util.List;

public class ExampleOzan {
    public static void main(String[] args) throws InterruptedException {

    /*
        TEST CASE
        1. Go to "https://www.apple.com/"
        2. Validate the title of the page is displayed as "Apple"
         */
        //1.Set uo driver

        /*

        System.setProperty("webdriver.chromedriver", "/Users/ozge/IdeaProjects/initial_selenium_project_5");

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();

       driver.get("https://www.apple.com/");

       String title = driver.getTitle().equals("Apple") ? "Title Validation is PASSED" : "Title Validation is FAILED";
       System.out.println(title);
        System.out.println("Title validation for the page = " + driver.getTitle());

       String url = driver.getCurrentUrl().equals("https://www.apple.com/") ? "URL Validation is PASSED" : "URL Validation is FAILED";
        System.out.println(url);
        System.out.println("URL validation for the page = " + driver.getCurrentUrl());
        driver.quit();

         */
        System.out.println("---------- TEST CASE 2 ----------");

        /*
        Go to https://www.techglobalschool.com
        Refresh the page
        Navigate to https://www.amazon.com/
        Navigate back to TechGlobal web site
        Navigate forward Amazon web site
        Validate the URL of the page
        Validate the title of the page

         */

        /*

        System.setProperty("webdriver.chromedriver", "/Users/ozge/IdeaProjects/initial_selenium_project_5");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.techglobalschool.com");
        driver.navigate().refresh();

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();

        String urlValidation = driver.getCurrentUrl().equals("https://www.amazon.com/") ?
                "URL Validation is PASSED" : "URL Validation is FAILED";
        System.out.println(urlValidation);
        System.out.println("URL Validation of the page = " + driver.getCurrentUrl());

        String titleValidation = driver.getTitle().equals("Amazon.com. Spend less. Smile more.") ?
                "Title Validation is PASSED" : "Title Validation is FAILED";
        System.out.println(titleValidation);
        System.out.println("Title Validation of the page = " + driver.getTitle());

        driver.quit();

         */

            /*
        System.setProperty("webdriver.chromedriver", "/Users/ozge/IdeaProjects/initial_selenium_project_5");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement image = driver.findElement(By.cssSelector("div[class*='k1zIA']>img"));
        System.out.println(image);
        System.out.println(image.isDisplayed());

        driver.quit();

             */

        /*
        System.setProperty("webdriver.chromedriver", "/Users/ozge/IdeaProjects/initial_selenium_project_5");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        List<WebElement> googleNavLinks = driver.findElements(By.xpath("//div[@class='o3j99 n1xJcf Ne6nSd']//a"));
        Waiter.pause(2);

        for (int i = 0; i < googleNavLinks.size(); i++) {
            System.out.println(googleNavLinks.get(i).getText()); // About, Store, Gmail, Images
            System.out.println(googleNavLinks.get(i).isDisplayed() && googleNavLinks.get(i).isEnabled() ? "PASSED" : "FAILED");
        }

            driver.quit();

         */

        System.setProperty("webdriver.chromedriver", "/Users/ozge/IdeaProjects/initial_selenium_project_5");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

       List<WebElement> bottomLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']//a"));

       String[] actualTexts = {"Advertising", "Business", "How Search works"};

        for (int i = 0; i < bottomLinks.size(); i++) {
            System.out.println(bottomLinks.get(i).getText());
            System.out.println(bottomLinks.get(i).getText().equals(actualTexts[i]) ? "PASSED" : "FAILED");
            System.out.println(bottomLinks.get(i).isDisplayed() && bottomLinks.get(i).isEnabled());
        }

        driver.quit();

    }
}
