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

public class n03_day05_RadioButton {


    // 1. create driver object from WebDriver class
    static WebDriver driver;

    @BeforeAll
    public static void setUp() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }


    // https://testcenter.techproeducation.com/index.php?page=radio-buttons
    // Click on Red
    // Click on Football

    @Test
    public void radioButton() {


        driver.get("https://testcenter.techproeducation.com/index.php?page=radio-buttons");

        // Click on Red
        WebElement redButton = driver.findElement(By.xpath("//input[@id='red']"));

        redButton.click(); //radio button olduğu için if condition ile kod
        // yazmamıza gerek yok ama yine de görmek için yazdık

        if (!redButton.isSelected()) {
            redButton.click();
        }

        Assertions.assertTrue(redButton.isSelected());


        // Click on Football

        WebElement football = driver.findElement(By.cssSelector("input[id='football']"));

        football.click();

        Assertions.assertTrue(football.isSelected());

    }

    @AfterAll
    public static void tearDown() {

        driver.close();


    }


}
