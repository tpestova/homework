//package hw2;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//public class ex3 {
//    private WebDriver driver;
//
//    @BeforeSuite (alwaysRun = true)
//    public static void setUpSuit() {
//        System.setProperty("webdriver.chrome.driver", "\"C:/Selenium/chromedriver.exe\");");
//    }
//
//    @AfterMethod
//    public void after() {
//        driver.close();
//    }
//
//    @BeforeMethod
//    public void before() {
//        System.setProperty("webdriver.chrome.driver", "\"C:/Selenium/chromedriver.exe\");");
//        driver = new ChromeDriver();
//    }
//
//    @BeforeClass{
//
//    }
//    @AfterSuite (alwaysRun = true)
//    public static void tearDownSuit() {
//        if (driver != null) {
//            driver.close();
//        }
//    }
//
//    @AfterClass
//
//    public class AnnotationsTests {
//
//        @Test
//        public void simpleTest1() {
//            driver.navigate().to("https://www.epam.com");
//            Assert.assertEquals(driver.getTitle(),
//                    "EPAM | Software Product Development Services");
//        }
//
//        }
//    }
//
