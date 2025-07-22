package page;

import Driver.DriveManager;
import org.openqa.selenium.By;
import utils.WaitHelper;

public class OrangeHRMHomePage {
    private final By userDropDown = By.xpath("//span[@class='oxd-userdropdown-tab']");
    private final By logout = By.xpath("//a[normalize-space()='Logout']");

    public OrangeHRMHomePage clickUserDropDown() {
        var element = WaitHelper.waitForElementClickable(DriveManager.getDriver(), userDropDown, 10);
        element.click();
        return this;
    }
    public OrangeHRMLoginPage clickLogout() {
        var element = WaitHelper.waitForElementClickable(DriveManager.getDriver(), logout, 10);
        element.click();
        return new OrangeHRMLoginPage();
    }
}
