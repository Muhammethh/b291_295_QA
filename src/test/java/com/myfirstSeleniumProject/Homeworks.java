package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Homeworks extends TestBase {


    // HOMEWORK

    // When user goes to https:// www.google.com/
    // Search for "porcelain teapot"
    // And print how many related results displayed on Google

    // HOMEWORK
    // Then create 3 different test methods using the following names. And Go to google.
    // titleTest =>Verify if google title = "Google"
    // imageTest => Verify if google image displays or not
    // gmailLinkTest => Verify if the Gmail link is displayed or not

    // Close the browser after each test


    @Test
    public void HW01() throws InterruptedException {

        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("porcelain teapot", Keys.ENTER);

        driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();

        WebElement totalResults = driver.findElement(By.xpath("//div[@id='result-stats']"));

        System.out.println(totalResults.getText());

        Thread.sleep(3000);


    }

    @Test
    public void titleTest() {


        driver.get("https://www.google.com/");


        System.out.println(driver.getTitle());

        Assertions.assertTrue(driver.getTitle().contains("Google"));


    }

    @Test
    public void imageTest() {

        driver.get("https://www.google.com/");

        WebElement imagesLink = driver.findElement(By.xpath("(//a[@class='gb_W'])[2]"));

        Assertions.assertTrue(imagesLink.isDisplayed());


    }


    @Test
    public void gmailLinkTest() {

        driver.get("https://www.google.com/");


        WebElement gmailLink = driver.findElement(By.xpath("(//a[@class='gb_W'])[1]"));

        Assertions.assertTrue(gmailLink.isDisplayed());

    }


}
