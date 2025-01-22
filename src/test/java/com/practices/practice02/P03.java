package com.practices.practice02;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class P03 extends TestBase {

    //Go to https://www.tutorialspoint.com/selenium/practice/alerts.php
    //press the click me button regarding the confirm box will appear
    //Press a button! Verify that your post is displayed in the alert
    //Close the alert with arrow
    //You pressed OK! Verify that it displays
    //press the click me button regarding the confirm box will appear
    //Close the alert with cancel
    //You pressed Cancel! Verify that it displays




    @Test
    void test01() {

        //https://www.tutorialspoint.com/selenium/practice/alerts.php adresine gidin
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");

        //confirm box will appear ile ilgili click me butonuna basin
        driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();

        //Press a button! yazisiniz alertte görüntülendigini doğrulayin
        String actualResult = driver.switchTo().alert().getText();
        String expectedResult = "Press a button!";
        Assertions.assertEquals(expectedResult,actualResult);

        //Alerti ok ile kapatin
        driver.switchTo().alert().accept();

        //You pressed OK! yazisinin görüntülendigini doğrulayin
        String actualResult1 = driver.findElement(By.id("desk")).getText();
        String expectedResult1 = "You pressed OK!";
        Assertions.assertEquals(expectedResult1,actualResult1);

        //confirm box will appear ile ilgili click me butonuna basin
        driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();


        //Alerti cancel ile kapatin
        driver.switchTo().alert().dismiss();

        //You pressed Cancel! yazisinin görüntülendigini doğrulayin
        String actualResult2 = driver.findElement(By.id("desk")).getText();
        String expectedResult2 = "You pressed OK!";
        Assertions.assertEquals(expectedResult2,actualResult2);


    }
}