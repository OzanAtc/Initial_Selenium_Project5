import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class Automation_Assignment {
    public static void main(String[] args) {

        try {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.facebook.com/");

        if (driver.getTitle().equals("Facebook - log in or sign up"))
            System.out.println("Page title validation is PASSED");
        else System.out.println("Page title validation is FAILED");

        Waiter.pause(2);

        if (driver.getCurrentUrl().equals("https://www.facebook.com/")) System.out.println("URL validation is PASSED");
        else System.out.println("URL validation is FAILED");

        Waiter.pause(2);

        WebElement logo = driver.findElement(By.cssSelector("img[class='fb_logo _8ilh img']"));

        if (logo.isDisplayed()) System.out.println("Logo validation is PASSED");
        else System.out.println("Logo validation is FAILED");

        Waiter.pause(2);

        WebElement header = driver.findElement(By.className("_8eso"));

        System.out.println(header.isDisplayed()); // checking the displayed product if it is there.
        System.out.println(header.getText()); // Correction of the text

        if (header.isDisplayed()) System.out.println("Heading2 display validation is PASSED");
        else System.out.println("Heading2 display validation is FAILED");

        Waiter.pause(2);

        if (header.getText().equals("Connect with friends and the world around you on Facebook."))
            System.out.println("Heading2 text validation is PASSED");
        else
            System.out.println("Heading2 text validation is FAILED");

        Waiter.pause(2);

        WebElement emailOrPhoneNumber = driver.findElement(By.id("email"));

        if (emailOrPhoneNumber.isDisplayed()) System.out.println("Email or Phone validation is PASSED");
        else System.out.println("Email or Phone validation is FAILED");

        Waiter.pause(2);

        WebElement password = driver.findElement(By.id("pass"));

        if (password.isDisplayed()) System.out.println("Password input box validation is PASSED");
        else System.out.println("Password input box validation is FAILED");

        Waiter.pause(2);

        WebElement loginButDisplayAndEnabled = driver.findElement(By.name("login"));

        if (loginButDisplayAndEnabled.isDisplayed()) System.out.println("Login button display is PASSED");
        else System.out.println("Login button display is FAILED");

        Waiter.pause(2);

        if (loginButDisplayAndEnabled.isEnabled()) System.out.println("Login button enable is PASSED");
        else System.out.println("Login button enable is FAILED");


        WebElement forgetPassword = driver.findElement(By.linkText("Forgot password?"));

        if (forgetPassword.isDisplayed()) System.out.println("Forget password link's display is PASSED");
        else System.out.println("Forget password link's display is FAILED");

        Waiter.pause(2);

        if (forgetPassword.isEnabled()) System.out.println("Forget password link is PASSED");
        else System.out.println("Forget password link is FAILED");

        Waiter.pause(2);

        if (forgetPassword.getText().equals("Forgot password?"))
            System.out.println("Forget password link match with the requirements is PASSED");
        else
            System.out.println("Forget password link match with the requirements is FAILED");


        WebElement newAccountValidation =
                driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));

        if (newAccountValidation.isDisplayed()) System.out.println("\"Create new account\" button validation PASSED");
        else System.out.println("\"Create new account\" button validation FAILED");

        } catch(Exception e) {
            System.out.println("TEST FAILED due to:" + e.getMessage());
        } finally {
            Driver.quitDriver();
        }


    }
}
