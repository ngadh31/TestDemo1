package MDM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    public LoginPage loginPage;

    @BeforeMethod
    public void setupPage() {
        loginPage = new LoginPage();
    }

    @Test(priority = 0)
    public void openUrl1() throws InterruptedException {
        driver.get("https://dev-fulfill.flashship.net/login");

    }

    @Test(priority = 1)
    public void testLoginInvalid() {
        loginPage.loginInvalid(driver);
    }
}


