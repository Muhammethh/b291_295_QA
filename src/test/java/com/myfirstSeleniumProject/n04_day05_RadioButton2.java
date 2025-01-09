package com.myfirstSeleniumProject;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class n04_day05_RadioButton2 {

    // 1. create driver object from WebDriver class
    static WebDriver driver;
    Faker faker = new Faker();

    @BeforeAll
    public static void setUp() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }


    @Test
    public void Test01() throws InterruptedException {

        // Create a class : RadioButton


        // Complete the following task.

        // Go to https://www.facebook.com/

        driver.get("https://www.facebook.com/r.php?entry_point=login");

        // Click on Create an Account button

        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys(faker.name().firstName());

        WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        lastname.sendKeys(faker.name().lastName());

        // Locate the elements of radio buttons

        WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));

        // Then click on the radio buttons for your gender if they are not selected

        if (!gender.isSelected()) {
            gender.click();
        }


        //email ekleme

        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));

        email.sendKeys(faker.internet().emailAddress());


        //password ekleme

        WebElement password = driver.findElement(By.xpath("//input[@id='password_step_input']"));

        password.sendKeys(faker.internet().password().toLowerCase());

        //signup tıklama

        WebElement signUp = driver.findElement(By.xpath("//button[@name='websubmit']"));

        signUp.click();

    }


    /*@AfterAll
    static void afterAll() {

        driver.quit();

    }*/

}
