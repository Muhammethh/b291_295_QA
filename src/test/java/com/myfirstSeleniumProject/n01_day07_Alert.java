package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class n01_day07_Alert extends TestBase {

    // Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts
    // Create a class: AlertTest
    // Create setUp method Create 3 test methods:
    // acceptAlert() => click on the first alert, verify the text "I am a JS Alert"
    // click OK
    // and Verify "You successfully clicked an alert"

    // dismissAlert()=> click on the second alert, verify text "I am a JS Confirm"
    // click cancel
    // and Verify "You clicked: Cancel"

    // sendKeysAlert()=> click on the third alert, verify text "I am a JS prompt",
    // type "Hello World", click OK
    // and Verify "You entered: Hello World"


    @Test
    public void acceptAlert() throws InterruptedException {

        // Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        // acceptAlert() => click on the first alert, verify the text "I am a JS Alert"
        WebElement clickAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));

        clickAlert.click();
        Thread.sleep(3000);


        //2.Adım Verify alert message

        Assertions.assertTrue(driver.switchTo().alert().getText().contains("I am a JS Alert"));

        //3. Adım Switch to yaparak Alert mesajını okeylemek

        driver.switchTo().alert().accept();

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));

        Assertions.assertTrue(result.getText().contains("You successfully clicked an alert"));

    }

    @Test
    public void dismissAlert() {

        // Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");


        // dismissAlert()=> click on the second alert, verify text "I am a JS Confirm"

        WebElement Jsmessage = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));

        Jsmessage.click();

        Assertions.assertTrue(driver.switchTo().alert().getText().contains("I am a JS Confirm"));

        // click cancel

        driver.switchTo().alert().dismiss();

        // and Verify "You clicked: Cancel"

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));

        Assertions.assertTrue(result.getText().contains("Cancel"));
    }



    @Test
    public void sendKeysAlert() throws InterruptedException {

        // sendKeysAlert()=> click on the third alert, verify text "I am a JS prompt",
        // type "Hello World", click OK
        // and Verify "You entered: Hello World"

        // Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        //butona tıkla

        WebElement alertButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

        alertButton.click();

        //Verify
        Assertions.assertTrue(driver.switchTo().alert().getText().contains("I am a JS prompt"));

        driver.switchTo().alert().sendKeys("Hello World");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        Assertions.assertTrue(driver.findElement(By.xpath("//p[@id='result']")).getText().contains("Hello World"));


    }

}
