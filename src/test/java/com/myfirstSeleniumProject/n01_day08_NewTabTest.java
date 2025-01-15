package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;

public class n01_day08_NewTabTest extends TestBase {

    /*Open the pages in 2 new windows and verify their  TITLES -> LinkedIn , Ebay
    Open 2 new tabs and verify their TITLES
                               -> LinkedIn , Ebay*/

    @Test
    public void newTabTest() throws InterruptedException {


        driver.get("https://www.linkedin.com/");
        Assertions.assertTrue(driver.getTitle().contains("LinkedIn"));

        String linkedin = driver.getWindowHandle();
        System.out.println("linkedin id = " + linkedin);

        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(3000);
        driver.get("https://www.ebay.com/");

        String ebay = driver.getWindowHandle();
        System.out.println("ebay id = " + ebay);

        Assertions.assertTrue(driver.getTitle().contains("eBay"));

        //24. lineda linkedin hashkodunu aldığımızdan dolayı geriye dönebiliriz
        driver.switchTo().window(linkedin);

        //39.lineda da ebayin hashcode nu aldığımızdan ileriye gidebiliriz
        driver.switchTo().window(ebay);

        Assertions.assertTrue(driver.getCurrentUrl().contains("ebay"));


    }
}
