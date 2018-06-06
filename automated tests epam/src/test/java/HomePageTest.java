import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {
    //Create a first test

    @Test
    public void openTestSiteByURL() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

            //Open test site by URL
            driver.navigate().to("https://epam.github.io/JDI/");

            //Assert Browser title
            driver.navigate().to("https://jdi-framework.github.io/tests/index.htm");
            Assert.assertEquals(driver.getTitle(), "Index Page");

            //Perform login
            WebElement userIcon = driver.findElement(By.cssSelector(".fa-user"));
            userIcon.click();
            driver.findElement(By.cssSelector("#Login")).sendKeys("epam");
            driver.findElement(By.cssSelector("#Password")).sendKeys("1234");
            driver.findElement(By.cssSelector(".form-horizontal button[type = 'submit']")).click();

            //Assert User name in the left-top side of screen that user is loggined
            WebElement userName = driver.findElement(By.cssSelector(".profile-photo span"));
            Assert.assertTrue(userName.isDisplayed());
            Assert.assertEquals(userName.getText(), "PITER CHAILOVSKII");

            //Assert Browser title "Home Page"
            driver.navigate().to("https://epam.github.io/JDI/");
            Assert.assertEquals(driver.getTitle(), "Home Page");

            //Assert that there are 4 items on the header section are displayed and they have proper texts
            WebElement sectionHome = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
            Assert.assertTrue(sectionHome.isDisplayed());
            Assert.assertEquals(sectionHome.getText(), "Home");

            WebElement sectionContactForm = driver.findElement(By.xpath("//span[contains(text(),'Contact form')]"));
            Assert.assertTrue(sectionContactForm.isDisplayed());
            Assert.assertEquals(sectionContactForm.getText(), "Contact form");

            WebElement sectionService = driver.findElement(By.xpath("//span[contains(text(),'Service')]"));
            Assert.assertTrue(sectionService.isDisplayed());
            Assert.assertEquals(sectionService.getText(), "Service");

            WebElement sectionMetalsColors = driver.findElement(By.xpath("//span[contains(text(),'Metals & Colors')]"));
            Assert.assertTrue(sectionMetalsColors.isDisplayed());
            Assert.assertEquals(sectionMetalsColors.getText(), "Metals & Colors");


            //Assert that there are 4 images on the Index Page and they are displayed
            driver.navigate().to("https://jdi-framework.github.io/tests/index.htm");
            WebElement imagePractise = driver.findElement(By.xpath("//span[@class='icons-benefit icon-practise']"));
            Assert.assertTrue(imagePractise.isDisplayed());
            WebElement imageCustom = driver.findElement(By.xpath("//span[@class='icons-benefit icon-custom']"));
            Assert.assertTrue(imageCustom.isDisplayed());
            WebElement imageMulti = driver.findElement(By.xpath("//span[@class='icons-benefit icon-multi']"));
            Assert.assertTrue(imageMulti.isDisplayed());
            WebElement imageBase = driver.findElement(By.xpath("//span[@class='icons-benefit icon-base']"));
            Assert.assertTrue(imageBase.isDisplayed());

            //Assert that there are 4 texts on the Index Page under icons and they have proper text
            WebElement divPractise = driver.findElement(By.xpath("//span[contains(@class, 'practise')]/../.."));
            Assert.assertEquals(divPractise.getText(), "To include good practices\n" +
                    "and ideas from successful\n" +
                    "EPAM projec");
            WebElement divCustom = driver.findElement(By.xpath("//span[contains(@class, 'custom')]/../.."));
            Assert.assertEquals(divCustom.getText(), "To be flexible and\n" +
                            "customizable");
            WebElement divMulti = driver.findElement(By.xpath("//span[contains(@class, 'multi')]/../.."));
            Assert.assertEquals(divMulti.getText(), "To be multiplatform");
            WebElement divBase = driver.findElement(By.xpath("//span[contains(@class, 'base')]/../.."));
            Assert.assertEquals(divBase.getText(), "Already have good base\n" +
                    "(about 20 internal and\n" +
                    "some external projects),\n" +
                    "wish to get more…");


            //Assert a text of the main header
            WebElement headerName = driver.findElement(By.xpath("//h3[@class='main-title text-center']"));
            Assert.assertTrue(headerName.isDisplayed());
            Assert.assertEquals(headerName.getText(), "EPAM FRAMEWORK WISHES…");

            WebElement headerText = driver.findElement(By.xpath("//p[@class='main-txt text-center']"));
            Assert.assertTrue(headerText.isDisplayed());
            Assert.assertEquals(headerText.getText(), "LOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA. UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.");

            //Assert a text of the sub header
            driver.navigate().to("https://epam.github.io/JDI/index.html");
            WebElement subHeaderName = driver.findElement(By.xpath("//a[@href='https://github.com/epam/JDI']"));
            Assert.assertTrue(subHeaderName.isDisplayed());
            Assert.assertEquals(subHeaderName.getText(), "JDI GITHUB");

            //Assert that JDI GITHUB is a link and has a proper URL
            //(не справилась)

            //Assert that there is Left Section
            WebElement leftSection = driver.findElement(By.xpath("//ul[@class='sidebar-menu']"));
            Assert.assertTrue(leftSection.isDisplayed());

            //Assert that there is Footer
            WebElement footerXpath = driver.findElement(By.xpath("//div[@class='footer-content overflow']"));
            Assert.assertTrue(footerXpath.isDisplayed());

            //Close Browser
            driver.close();


    }
}
