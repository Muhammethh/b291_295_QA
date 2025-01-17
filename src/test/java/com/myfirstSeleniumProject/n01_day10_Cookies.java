package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class n01_day10_Cookies extends TestBase {

   // Class: Cookies
   // Method: handleCookies
   // Go to amazon  and automate the tasks:
   // Find the total number of cookies
   // Print all the cookies
   // Get the cookies by their name
   // Add new cookie
   // Delete all cookies


    @Test
    public void handleCookies() {

        driver.get("https://techproeducation.com/");

        // Find the total number of cookies
        Set<Cookie> allCookies = driver.manage().getCookies();
        System.out.println("Bütün çerezler = " + allCookies.size());


        // Print all the cookies
        for (Cookie eachCookie : allCookies){

            System.out.println("Herbir cookie" + eachCookie);

            // Get the cookies by their name
            System.out.println("Herbirinin ismi = " + eachCookie.getName());

            System.out.println("Domain = " + eachCookie.getDomain());

            System.out.println("Expiry = " + eachCookie.getExpiry());

        }

        System.out.println("*************************************");

        System.out.println(driver.manage().getCookieNamed("_ga"));

        // Add new cookie
        Cookie addNewCookie = new Cookie("selenium","dersi");

        driver.manage().addCookie(addNewCookie);

        Set<Cookie> newAllCookies = driver.manage().getCookies();
        for (Cookie each : newAllCookies){

            System.out.println(each);

        }

        // Delete all cookies
        
        driver.manage().deleteAllCookies();

        Set<Cookie> emptyList = driver.manage().getCookies();
        System.out.println(emptyList.size());

    }
}
