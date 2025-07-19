import Driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    @Test
    public void test1()
    {
        Driver.driver.manage().window().maximize();
        Driver.driver.get("https://www.amazon.in/");
        Driver.driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
    }
}