package com.myfirstSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class n03_day02_VerifyTitleTest {

    public static void main(String[] args) {

        /*Create a new class: VerifyTitleTest

        Navigate to  techproeducation homepage / amazon homepage

        3. Verify if page title is
        "Techpro Education | Online It Courses & Bootcamps" /
                OR
        "Amazon.com. Spend less. Smile more."

        4. Close the window*/

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.techproeducation.com.tr/");

        String actualResult = driver.getTitle();

        if (actualResult.contains("Bootcamps")){

            System.out.println("PASSED");

        }else {
            System.out.println(actualResult + " does not have Bootcamps in the title so this test case is failed");
        }


        driver.close();


        //ODEV
        //AYNISINI amazon için yap


    }
}
