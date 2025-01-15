package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class day08_reusableDropdown extends TestBase {


    @Test
    public void resuableDropdown() throws InterruptedException {

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        //1.Create method selectByIndexTest and Select Option 1 using index

        //1.Adım dropdown için locator al

        WebElement simpleDropDown = driver.findElement(By.id("dropdown"));

        dropdownSelectByIndex(simpleDropDown,1); //testbasede oluşturulan method
        Thread.sleep(3000);


        dropdownSelectByVisibleText(simpleDropDown,"Option 2");
        Thread.sleep(3000);



    }
}
