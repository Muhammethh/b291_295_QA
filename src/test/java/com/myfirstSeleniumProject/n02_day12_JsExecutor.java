package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class n02_day12_JsExecutor extends TestBase {


    @Test
    public void jsExecutor() throws InterruptedException {


//        Given user is on the https://www.amazon.com/

        driver.get("https://www.amazon.com/");

//        When user click on "Account" link
        WebElement accountList = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));


        // Fare suan account list buttonun da
        actionsHoverOnElement(accountList);


        WebElement account = driver.findElement(By.xpath("//span[text()='Account']"));

        // 1. adim bir tane javscript reference olustur....

        JavascriptExecutor js = (JavascriptExecutor) driver;


        // 2. adim js executor ile account elementine tiklamak......

        js.executeScript("arguments[0].click();", account);


//        Then verify the page title contains "Your account"

        Assertions.assertTrue(driver.getTitle().contains("Your Account"));

//        Then scroll to Amazon Music element at the bottom of the page

        WebElement amazonMusic = driver.findElement(By.xpath("//a[text()='Amazon Music']"));

        js.executeScript("arguments[0].scrollIntoView(true);", amazonMusic);

        Thread.sleep(2000);


//        Click on it
        js.executeScript("arguments[0].click();", amazonMusic);

//        Then verify Amazon Music page is displayed

        Assertions.assertTrue(driver.getCurrentUrl().contains("music"));


//        Scroll the page up and down

        js.executeScript("window.scrollBy(0,250)", "");

    }


    @Test
    public void reasuableMethod() throws InterruptedException {


//        Given user is on the https://www.amazon.com/

        driver.get("https://www.amazon.com/");

//        When user click on "Account" link
        WebElement accountList = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));

        // Fare suan account list buttonun da
        actionsHoverOnElement(accountList);

        WebElement account = driver.findElement(By.xpath("//span[text()='Account']"));

        // 1. adim call reasuble method for click


        clickByJS(account);


//        Then verify the page title contains "Your account"

        Assertions.assertTrue(driver.getTitle().contains("Your Account"));

//        Then scroll to Amazon Music element at the bottom of the page

        WebElement amazonMusic = driver.findElement(By.xpath("//a[text()='Amazon Music']"));


        scrollIntoViewJS(amazonMusic);

        Thread.sleep(2000);


//        Click on it
        clickByJS(amazonMusic);

//        Then verify Amazon Music page is displayed

        Assertions.assertTrue(driver.getCurrentUrl().contains("music"));


//        Scroll the page up and down

        scrollAllDownJS();

        scrollAllUpJS();


    }

}
