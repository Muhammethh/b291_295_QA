package com.myfirstSeleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class n02_day02_WebDriverManager {

    public static void main(String[] args) {

        //Webdrivermanager dependency pom.xml dosyasına ekledik ve bizim için artık system.setProperty kullanmamıza gerek kalmadı


        //WebdriverManager eklenince ne oluyor?

        WebDriverManager.firefoxdriver().setup();

        //Webdriver interfaceinden driver objesi oluşturuyoruyz

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        //navigate to the page

        driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.9.2");


        //Close the application

        driver.close();


    }
}
