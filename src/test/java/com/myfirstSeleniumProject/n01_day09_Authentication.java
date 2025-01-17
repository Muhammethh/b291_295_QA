package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;

public class n01_day09_Authentication extends TestBase {


    @Test
    public void authentication() throws InterruptedException {

       /*
        username : admin
        password : admin
        url	: the-internet.herokuapp.com/basic_auth

        URL FOR AUTH:
        https://admin:admin@the-internet.herokuapp.com/basic_auth

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); This will auth the page*/


        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(15000);


    }
}
