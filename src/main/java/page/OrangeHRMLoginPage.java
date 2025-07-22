package page;

import Driver.DriveManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitHelper;

import java.time.Duration;

public final class OrangeHRMLoginPage {
    private final By textEmail = By.name("username");
    private final By textPassword = By.name("password");
    private final By buttonLogin = By.xpath("//button[normalize-space()='Login']");

    public OrangeHRMLoginPage enterUsername(String username) {
        var element = WaitHelper.waitForElementVisible(DriveManager.getDriver(), textEmail, 10);
        element.clear();
        element.sendKeys(username);
        return this;
    }
    public OrangeHRMLoginPage enterPassword(String password) {
        var element = WaitHelper.waitForElementVisible(DriveManager.getDriver(), textPassword, 10);
        element.clear();
        element.sendKeys(password);
        return this;
    }
    public OrangeHRMHomePage clickLogin() {
        var element = WaitHelper.waitForElementVisible(DriveManager.getDriver(), buttonLogin, 10);
        element.click();
        return new OrangeHRMHomePage();
    }
}
