package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ReadPropertiesFile;

import java.io.IOException;
import java.util.Objects;

public final class Driver {
    public static WebDriver driver;

    private Driver() {

    }


    public static void init() throws IOException {
        if (Objects.isNull(driver)) {
            driver = new ChromeDriver();
            System.out.println(DriveManager.getDriver());
            DriveManager.setDriver(driver);
            DriveManager.getDriver().get(ReadPropertiesFile.getValue("URL"));
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriveManager.getDriver())) {
            DriveManager.getDriver().quit();
            DriveManager.unload();
        }
    }
}
