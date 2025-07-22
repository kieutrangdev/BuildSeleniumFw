import Driver.DriveManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import page.OrangeHRMHomePage;
import page.OrangeHRMLoginPage;

public class LoginPageTest extends BaseTest{

    @Test
    public void test1() throws InterruptedException {
        OrangeHRMLoginPage orangeHRMLoginPage = new OrangeHRMLoginPage();
//        orangeHRMLoginPage.enterUsername("lkt");
//        orangeHRMLoginPage.enterPassword("lkt123");
//        orangeHRMLoginPage.clickLogin();

        OrangeHRMHomePage orangeHRMHomePage = orangeHRMLoginPage.enterUsername("Admin").enterPassword("admin123").clickLogin();
        orangeHRMHomePage.clickUserDropDown().clickLogout();
    }
}