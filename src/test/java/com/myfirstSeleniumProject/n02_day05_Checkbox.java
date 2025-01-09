package com.myfirstSeleniumProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class n02_day05_Checkbox {

    //Create a class : CheckBox

    //Create test method and complete the following task.
    //Go to https://testcenter.techproeducation.com/index.php?page=checkboxes
    //Locate the elements of checkboxes

    //Then click on checkbox1 if box is not selected

    //Then click on checkbox2 if box is not selected

    //Then verify that checkbox1 is checked.

    static WebDriver driver;

    @BeforeAll
    public static void setUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void checkBox() {


        //Create test method and complete the following task.
        //Go to https://testcenter.techproeducation.com/index.php?page=checkboxes

        driver.get("https://testcenter.techproeducation.com/index.php?page=checkboxes");

        //Locate the elements of checkboxes

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));

        WebElement checkbox2 = driver.findElement(By.cssSelector("input[name='checkbox2']"));

        //Then click on checkbox1 if box is not selected

        if (!checkbox1.isSelected()){

            checkbox1.click();

        }

        //Then click on checkbox2 if box is not selected



        if (!checkbox2.isSelected()){

            checkbox2.click();

        }



        //Then verify that checkbox1 is checked.

        Assertions.assertTrue(checkbox1.isSelected());

    }


}
