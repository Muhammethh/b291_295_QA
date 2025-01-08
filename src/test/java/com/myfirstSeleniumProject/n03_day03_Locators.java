package com.myfirstSeleniumProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class n03_day03_Locators {

   /* Create a class : Locators
    Create a class: Locators
    When user goes to :
    https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    And enter username
    And enter password
    And click on submit button
    Then verify the login is successful
    Then logout the application
    Then verify the logout is successful*/

    static WebDriver driver;

    @BeforeAll
    public static void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void Test01() {

        //     Create a class : Locators
        // Create a class: Locators
        // When user goes to :
        // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // ----And enter username

        //1.Adım webelementi tanımlamak
        WebElement username = driver.findElement(By.name("username"));

        //2.Adım o webelementiyle işlem yapmak

        username.sendKeys("Admin");

        // ----And enter password


        //1.Adım webelementini bulmak
        WebElement password = driver.findElement(By.name("password"));

        //2.adım o elementi kullanmak
        password.sendKeys("admin123");


        // ----And click on Login button
        //1.Adım webelementini bulmak

        WebElement loginButton = driver.findElement(By.tagName("button"));

        //2.adım o elementi kullanmak

        loginButton.click();


        // ----Then verify the login is successful

        Assertions.assertTrue(driver.getCurrentUrl().contains("dashboard"));

        // ----Then logout the application

        //1.Adım webelementini bulmak
        WebElement profileButton = driver.findElement(By.className("oxd-userdropdown-name"));

        //2.adım o elementi kullanmak

        profileButton.click();


        //Logout Butonuna tıklama
        WebElement logoutButton = driver.findElement(By.linkText("Logout"));

        logoutButton.click();

        // ----Then verify the logout is successful

        Assertions.assertTrue(driver.getCurrentUrl().contains("login"));

        Assertions.assertFalse(driver.getCurrentUrl().contains("dashboard"));



    }


}
