import Driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseTest {


    @BeforeMethod
    public void setUp() {
        Driver.init();
        Driver.driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown()
    {
        Driver.quitDriver();
    }
}