import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task16b {

    WebDriver driver;

    @Test
    public void Wiki()
    {
        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence", Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='vector-toc-text']")).click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        //Assert.assertEquals(url,"https://en.wikipedia.org/wiki/Artificial_intelligence#History");

    }
}
