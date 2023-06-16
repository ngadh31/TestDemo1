package MDM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class LoginPage {
    WebDriver driver;

    public void LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public By userName = By.xpath("//input[@name='username']");
    public By passWord = By.xpath("//input[@name='password']");
    public By btnLogin = By.xpath("//button[@type='submit']");

    public void loginInvalid(WebDriver driver){
        driver.get("https://dev-fulfill.flashship.net/login");
        driver.findElement(userName).sendKeys("345678");
        driver.findElement(passWord).sendKeys("123456");
        driver.findElement(btnLogin).click();
    }
}
