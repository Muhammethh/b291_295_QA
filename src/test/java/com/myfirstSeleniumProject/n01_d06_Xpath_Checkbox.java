package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class n01_d06_Xpath_Checkbox extends TestBase {


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


}
