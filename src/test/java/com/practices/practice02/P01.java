package com.practices.practice02;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01 extends TestBase {

    @Test
    void test01() throws InterruptedException {
        // https://testpages.herokuapp.com/styled/calculator adresine gidin
        // Dört farkli test metdhodu olusturarak matematiksel işlem icin uygulamayi test edin.

        driver.get("https://testpages.herokuapp.com/styled/calculator");

        String firstNumber = "5";
        String secondNumber = "5";
        driver.findElement(By.xpath("//input[@id='number1']")).sendKeys(firstNumber);

        driver.findElement(By.xpath("//input[@id='number2']")).sendKeys(secondNumber);

        WebElement dropDown = driver.findElement(By.id("function"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("plus");

        driver.findElement(By.id("calculate")).click();

        String actualResult = driver.findElement(By.id("answer")).getText();
        String expectedresult =  Integer.valueOf(firstNumber)  + Integer.valueOf(secondNumber) +"" ;

        Assertions.assertEquals(expectedresult,actualResult);

    }


    @Test
    void minus() throws InterruptedException {
        // https://testpages.herokuapp.com/styled/calculator adresine gidin
        // Dört farkli test metdhodu olusturarak matematiksel işlem icin uygulamayi test edin.

        driver.get("https://testpages.herokuapp.com/styled/calculator");

        String firstNumber = "10";
        String secondNumber = "5";
        driver.findElement(By.xpath("//input[@id='number1']")).sendKeys(firstNumber);

        driver.findElement(By.xpath("//input[@id='number2']")).sendKeys(secondNumber);

        driver.findElement(By.id("function")).sendKeys("minus");


        driver.findElement(By.id("calculate")).click();

        String actualResult = driver.findElement(By.id("answer")).getText();
        String expectedresult =  Integer.valueOf(firstNumber)  - Integer.valueOf(secondNumber) +"" ;

        Assertions.assertEquals(expectedresult,actualResult);



    }


}
