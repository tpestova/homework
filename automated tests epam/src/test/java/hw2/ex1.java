package hw2;

import org.testng.annotations.DataProvider;

public class ex1 {

    @DataProvider
    public Object[][] SimpleDataProvider() {
        return new Object[][]{
                {"//span[@class='icons-benefit icon-practise']", "To include good practices\n" +
                        "and ideas from successful\n" +
                        "EPAM projec"},
                {"//span[contains(@class, 'custom')]/../..", "To be flexible and\n" +
                        "customizable"},
                {"//span[contains(@class, 'multi')]/../..", "To be multiplatform"},
                {"//span[contains(@class, 'base')]/../..", "Already have good base\n" +
                        "(about 20 internal and\n" +
                        "some external projects),\n" +
                        "wish to get more…"}
        };
    }
}

