import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {
    ChromeDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://leafground.com/input.xhtml");
        driver.manage().window().maximize();

    }

    @Test
    public void textBox() {
        driver.findElement(By.xpath("//input[@name='j_idt88:name']"))
                .sendKeys("678585");

        driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']"))
                .sendKeys("India");
        boolean flag = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt93']")).isEnabled();
        Assert.assertFalse(flag);
        String value = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value");
        System.out.println(value);
        Assert.assertEquals(value, "My learning is superb so far.");

    }
}
