package hw2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ex2 {
    private WebDriver driver;

    public class Smoke {

        @Test(groups = {"smoke"})
        public void simpleTest1() {
            System.setProperty("webdriver.chrome.driver", "\"C:/Selenium/chromedriver.exe\");");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.epam.com");
            Assert.assertEquals(driver.getTitle(),
                    "EPAM | Software Product Development Services");
            driver.close();
        }


        @Test(groups = {"smoke"})
        public void simpleTest2() {
            System.setProperty("webdriver.chrome.driver", "\"C:/Selenium/chromedriver.exe\");");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.epam.com");
            Assert.assertEquals(driver.getTitle(),
                    "EPAM | Software Product Development Services");
            driver.close();
        }


        @Test(groups = {"smoke"})
        public void simpleTest3() {
            System.setProperty("webdriver.chrome.driver", "\"C:/Selenium/chromedriver.exe\");");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.epam.com");
            Assert.assertEquals(driver.getTitle(),
                    "EPAM | Software Product Development Services");
            driver.close();
        }
    }

    public class Regression {

        @Test(groups = {"regression"})
        public void simpleTest1() {
            System.setProperty("webdriver.chrome.driver", "\"C:/Selenium/chromedriver.exe\");");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.epam.com");
            Assert.assertEquals(driver.getTitle(),
                    "EPAM | Software Product Development Services");
            driver.close();
        }

        @Test(groups = {"regression"})
        public void simpleTest2() {
            System.setProperty("webdriver.chrome.driver", "\"C:/Selenium/chromedriver.exe\");");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.epam.com");
            Assert.assertEquals(driver.getTitle(),
                    "EPAM | Software Product Development Services");
            driver.close();
        }

        @Test(groups = {"regression"})
        public void simpleTest3() {
            System.setProperty("webdriver.chrome.driver", "\"C:/Selenium/chromedriver.exe\");");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.epam.com");
            Assert.assertEquals(driver.getTitle(),
                    "EPAM | Software Product Development Services");
            driver.close();
        }

        public class Annotations {

            @Test(groups = {"smoke"})
            public void simpleTest1() {
                System.setProperty("webdriver.chrome.driver", "\"C:/Selenium/chromedriver.exe\");");
                WebDriver driver = new ChromeDriver();
                driver.navigate().to("https://www.epam.com");
                Assert.assertEquals(driver.getTitle(),
                        "EPAM | Software Product Development Services");
                driver.close();
            }

            @Test(groups = {"regression"})
            public void simpleTest2() {
                System.setProperty("webdriver.chrome.driver", "\"C:/Selenium/chromedriver.exe\");");
                WebDriver driver = new ChromeDriver();
                driver.navigate().to("https://www.epam.com");
                Assert.assertEquals(driver.getTitle(),
                        "EPAM | Software Product Development Services");
                driver.close();
            }

            @Test(groups = {"regression"})
            public void simpleTest3() {
                System.setProperty("webdriver.chrome.driver", "\"C:/Selenium/chromedriver.exe\");");
                WebDriver driver = new ChromeDriver();
                driver.navigate().to("https://www.epam.com");
                Assert.assertEquals(driver.getTitle(),
                        "EPAM | Software Product Development Services");
                driver.close();
            }
        }
    }
}
