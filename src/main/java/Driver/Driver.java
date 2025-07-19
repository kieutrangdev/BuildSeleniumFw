package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver;
    public static void init()
    {
        driver = new ChromeDriver();
    }

    public static void quitDriver()
    {
        driver.quit();

    }
}
