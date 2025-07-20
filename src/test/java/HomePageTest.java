
import Driver.DriveManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
    @Test
    public void test1()
    {
//        DriveManager.getDriver().get("");
        DriveManager.getDriver().findElement(By.xpath("//span[text()='Hello, sign in']")).click();
    }
}
