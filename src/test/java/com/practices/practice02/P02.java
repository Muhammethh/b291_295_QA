package com.practices.practice02;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02 extends TestBase {

    // https://demo.guru99.com/test/radio.html
    // select if checkbox1 and checkbox3 are not selected
    //test that checkbox1 and checkbox3 are selected
    //test if checkbox2 element is not selected



    @Test
    void test01() {
        // https://demo.guru99.com/test/radio.html
        driver.get("https://demo.guru99.com/test/radio.html");

        // checkbox1 ve checkbox3 seçili değilse seçin
        WebElement radioButton1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radioButton2 = driver.findElement(By.id("vfb-7-2"));
        WebElement radioButton3 = driver.findElement(By.id("vfb-7-3"));

        WebElement cb1 = driver.findElement(By.id("vfb-6-0"));
        WebElement cb2 = driver.findElement(By.id("vfb-6-1"));
        WebElement cb3 = driver.findElement(By.id("vfb-6-2"));

        if (!cb1.isSelected()){
            cb1.click();
        }

        if (!cb3.isSelected()){
            cb3.click();
        }

        // checkbox1 ve checkbox3 seçili olduğunu test edin
        Assertions.assertTrue(cb1.isSelected());
        Assertions.assertTrue(cb3.isSelected());

        // checkbox2 elementinin seçili olmadığını test edin
        Assertions.assertFalse(cb2.isSelected());

        //radiobutton1 i seçiniz
        radioButton1.click();

        //radiobutton 1in seçili olduğunu test ediniz
        Assertions.assertTrue(radioButton1.isSelected());

        //radiobutton 2in seçili olmadığını test ediniz
        Assertions.assertFalse(radioButton2.isSelected());

        //radiobutton 3ün seçili olmadığını test ediniz
        Assertions.assertFalse(radioButton3.isSelected());





    }


}
