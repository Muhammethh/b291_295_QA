package com.myfirstSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

    public static void main(String[] args) {


        // 1. step; System property is used to iniate the driver
        // driver i atamak icin sistem property kullanilir

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        //2.step create the Chrome driver

        WebDriver driver = new ChromeDriver();

        //3.step go to the website

        driver.get("https://www.amazon.com.tr/");



    }



}
