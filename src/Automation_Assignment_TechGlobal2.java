import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;

import java.util.List;

public class Automation_Assignment_TechGlobal2 {

    public static void main(String[] args) {

        /*
                            /*
                        TEST CASE 1
            Go to https://techglobal-training.netlify.app/
            Select "Frontend Testing" from the "Practices" dropdown
            Select the "Xpath-CSS Locators" card
            Validate the Programming Languages list items below
            Java
            JavaScript
            C#
                              */


        /*
                         TEST CASE 2
               Go to https://techglobal-training.netlify.app/
              Select "Frontend Testing" from the "Practices" dropdown
                 Select the "Xpath-CSS Locators" card
                Validate the Automation Tools list items below
                          Selenium WebDriver
                             WebDriverIO
                               Cypress
                              Playwright
                             */
/*

        WebDriver driver = Driver.getDriver();

        driver.get("https://techglobal-training.netlify.app/");
        TechGlobalUtil.getFrontendTesting();
        TechGlobalUtil.clickOnCard(2);

        System.out.println(driver.findElement(By.xpath("(//h3[@class='Xpath_subheader__VOtsU'])[1]")).getText());

        List<WebElement> proLanguages = driver.findElements(By.xpath("((//ul)[2])/li"));

        String[] actualText = {"Java","JavaScript","C#"};

        for (int i = 0; i < proLanguages.size(); i++) {

            System.out.println("Elements texts are = " + proLanguages.get(i).getText());
            System.out.println("Elements are displayed = " + proLanguages.get(i).isDisplayed());

            System.out.println("Elements are matching = " + proLanguages.get(i).getText().equals(actualText[i]));

        }

        Driver.quitDriver();
 */

       WebDriver driver2 = Driver.getDriver();

       driver2.get("https://techglobal-training.netlify.app/");
       TechGlobalUtil.getFrontendTesting();
        TechGlobalUtil.clickOnCard(2);

      List<WebElement> tools = driver2.findElements(By.xpath("((//ul)[3])//li"));

      String[] actualText2 = {"Selenium WebDriver","WebDriverIO","Cypress","Playwright"};

       for (int i = 0; i < tools.size(); i++) {

           System.out.println("Elements texts are = " + tools.get(i).getText());
           System.out.println("Elements are displayed = " + tools.get(i).isDisplayed());
           System.out.println("Elements are matching = " + tools.get(i).getText().equals(actualText2[i]));

      }
          Driver.quitDriver();
    }
}
