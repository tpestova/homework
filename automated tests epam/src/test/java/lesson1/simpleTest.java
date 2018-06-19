package lesson1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class simpleTest {
    @Test
    public void simpleSeleniumTest() {
        System.setProperty("webdriver.chrome.driver", "\"C:/Selenium/chromedriver.exe\");");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.epam.com");
        Assert.assertEquals(driver.getTitle(), "EPAM | Software Product 				Development Services");
        driver.close();

    }

}
