package com.practices.practice02;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class P04 extends TestBase {
    //Go to https://www.tutorialspoint.com/selenium/practice/login.php
    //Log in with the email you received from https://www.fakemail.net/
    //Verify that Welcome, Login In is displayed


    @Test
    void test01() {

        //https://www.tutorialspoint.com/selenium/practice/login.php adresine gidin
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");

        WebElement emailBox = driver.findElement(By.id("email"));
        WebElement passwordBox = driver.findElement(By.id("password"));


        //https://www.fakemail.net/ sitesinden aldiginiz email ile login olun
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.fakemail.net/ ");
        String fakeEmail = driver.findElement(By.id("email")).getText();

        Set<String> windowHandles = driver.getWindowHandles();


            /*
        getWindowHandles() methodu set return eder, setler de index ile handle degeri secebilieceğimiz get() methodu yoktur
        bu nedenle seti kullanarak yeni bir list olusturduk, listlerde bulunan get methodu sayesinde istedigimiz window handle degerine erisebiliriz
         */
        List<String> windows = new ArrayList<>(windowHandles); //setlerde index olmadığı için liste çevirip ilk pencerenin indeksiyle çağırdık

        driver.switchTo().window(windows.get(0));

        emailBox.sendKeys(fakeEmail);
        passwordBox.sendKeys("passwordexmp");

        //Welcome, Login In yazisinin görüntülendigini doğrulayin



    }
}