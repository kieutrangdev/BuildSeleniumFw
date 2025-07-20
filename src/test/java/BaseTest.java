import Driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {


    @BeforeMethod
    public void setUp() throws Exception {
        Driver.init();
        Driver.driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown()
    {
        Driver.quitDriver();
    }
}