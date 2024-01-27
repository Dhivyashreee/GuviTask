import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task16a {
    WebDriver driver;

    @Test
    public void Chrome() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        String val = driver.getTitle();
        System.out.println(val);
        Assert.assertEquals(val, "STORE");
        if (val.contains("STORE")) {
            System.out.println("Page landed on correct website");
        } else {

            System.out.println("Page not landed on correct website");
        }
        driver.quit();
    }
}


