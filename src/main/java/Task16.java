import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Task16 {

    WebDriver driver;


    public void Firefox() {
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        String value = driver.getCurrentUrl();
        System.out.println("Current url:"value);
        Assert.assertEquals(value, "https://www.google.com/");
        driver.navigate().refresh();
        driver.quit();
    }
}








