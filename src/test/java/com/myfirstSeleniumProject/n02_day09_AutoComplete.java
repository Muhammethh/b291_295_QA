package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class n02_day09_AutoComplete extends TestBase {


    //    Given user is on https://testcenter.techproeducation.com/index.php?page=autocomplete
    //When user type "uni" in the search box
    //And select the 'United Kingdom' from the suggestions
    //And click on submit button
    //Then verify the result contains 'United Kingdom'


    @Test
    public void autocomplete() throws InterruptedException {

        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");

        WebElement countrySearchBox = driver.findElement(By.id("myCountry"));

        countrySearchBox.sendKeys("uni");

        //And select the 'United Kingdom' from the suggestions
        driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//div[text()='ted Kingdom']")).click();

        //And click on submit button
        driver.findElement(By.xpath("//input[@type='button']")).click();

        //Then verify the result contains 'United Kingdom'
        WebElement result = driver.findElement(By.id("result"));

        Assertions.assertTrue(result.getText().contains("You selected: United Kingdom"));

        Thread.sleep(3000);


    }
}
