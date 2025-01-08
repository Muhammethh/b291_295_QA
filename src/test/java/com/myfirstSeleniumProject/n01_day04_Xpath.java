package com.myfirstSeleniumProject;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class n01_day04_Xpath {


    // Create a class : Locators
    // Create a class: Locators
    // When user goes to :
    // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    // And enter username
    // And enter password
    // And click on submit button
    // Then verify the login is successful
    // Then logout the application
    // Then verify the logout is successful

    static WebDriver driver;

    @BeforeAll
    public static void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void xpath() {

        // Create a class : Locators
        // Create a class: Locators
        // When user goes to :
        // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        // And enter username

        //1.Adım webelementini oluşturmam lazım bunun için de locaterını almam lazım...

        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));

        //2.Adım username gönder

        userName.sendKeys("Admin");

        // And enter password

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

        password.sendKeys("admin123");

        // And click on submit button

        WebElement logIn = driver.findElement(By.xpath("//button[@type='submit']"));

        logIn.click();

        // Then verify the login is successful

        WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));

        Assertions.assertTrue(dashboard.getText().contains("Dashboard"));

        // Then logout the application

        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();

        WebElement logOut = driver.findElement(By.xpath("(//a[@role='menuitem'])[4]"));

        logOut.click();

        // Then verify the logout is successful

        WebElement logOutSuc = driver.findElement(By.xpath("//h5[text()='Login']"));

        Assertions.assertTrue(logOutSuc.getText().contains("Login"));

    }

    @AfterAll
    public static void tearDown(){

        driver.close();

    }




}
