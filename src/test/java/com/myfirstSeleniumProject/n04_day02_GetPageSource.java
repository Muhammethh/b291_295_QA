package com.myfirstSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class n04_day02_GetPageSource {

    public static void main(String[] args) {

        //        Test if amazon contains "Registry" on the homepage
        //        Create a new class : GetPageSource

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com.tr/");

        String actualResult = driver.getPageSource(); //sayfa kaynak kodlarını

        if (actualResult.contains("Registry")){

            System.out.println("Test passed");

        }else {
            System.out.println("Test failed");
        }

        driver.quit();

    }


}
