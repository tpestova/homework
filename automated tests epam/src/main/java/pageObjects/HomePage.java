package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    @FindBy(css = ".fa-user")
    private WebDriver userIcon;

    @FindBy(css = "#Name")
    private WebDriver loginInput;

    @FindBy(css = "#Password11")
    private WebDriver passwordInput;

    @FindBy(css = ".form-horizontal button[type = 'submit']")
    private WebDriver submitButton;

    public void open(WebDriver driver) {
        driver.navigate().to("https://jdi-framework.github.io/tests/index.htm");
    }

    public void login(String login, String password) {
        userIcon.click();
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        submitButton.click();
    }

    public void checkHomePageTitle(WebDriver driver) {
        Assert.assertEquals(driver.getTitle(), "Index Page");
    }
}
