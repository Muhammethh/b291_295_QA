package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class n03_day07_Window extends TestBase {

    @Test
    public void windowOperations() throws InterruptedException {


        //Go to https://the-internet.herokuapp.com/windows
//        Assert if the window 1 title equals "The Internet"
//        Click on the link
//        Assert if the window 2 title equals "New Window"
//        Switch back to window 1 title and assert if URL contains "windows"
//        And assert if the URL doesn't contains 'new'


        driver.get("https://the-internet.herokuapp.com/windows");

        Assertions.assertEquals("The Internet", driver.getTitle());

        driver.findElement(By.linkText("Click Here")).click();
        Thread.sleep(3000);

        String theInternetWin = driver.getWindowHandle();

        System.out.println("theInternetWin = " + theInternetWin);

        //2.adım bütün hashkodları almam lazım new window penceresine geçmek için

        Set<String> allWindow = driver.getWindowHandles();//Bu method bütün hashcodeları bir set datasına assign eder

        String newWindow ="";

        for (String each : allWindow ){

            if (!each.equals(theInternetWin)){

                newWindow = each;

            }

        }

        driver.switchTo().window(newWindow);

        Assertions.assertTrue(driver.getTitle().contains("New Window")); //bunun true dönmesiiçin diğer pencereye geçiş yapmalıyız


    }


}
