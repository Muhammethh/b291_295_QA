package com.myfirstSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01_BasicNavigators {


    public static void main(String[] args) {

        //When user goes to walmart

        //1.Adım: driverın frameworkde nerede olduğunu tanımla

        System.setProperty("webdriver.chrome", "drivers/chromedriver.exe");

        //2. driver oluştur

        WebDriver driver = new ChromeDriver();

        //3. Adım sayfayı büyüt

        driver.manage().window().maximize();

        // Then goes to amazon

        driver.get("https://www.amazon.com.tr/");

        // Navigate to Walmart

        driver.navigate().to("https://www.walmart.com/");

        // Navigate back to amazon

        driver.navigate().back();

        // Navigate forward to Walmart

        driver.navigate().forward();

        // Refresh the page

        driver.navigate().refresh();

        // Close/Quit the browser

        driver.close();

    }


}
