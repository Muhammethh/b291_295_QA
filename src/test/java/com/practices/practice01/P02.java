package com.practices.practice01;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class P02 extends TestBase {

    @Test
    void test01() throws InterruptedException {
        // https://testpages.herokuapp.com/styled/calculator adresine gidin
        // Dört farkli test metdhodu olusturarak matematiksel işlem icin uygulamayi test edin.

        driver.get("https://testpages.herokuapp.com/styled/calculator");

        driver.findElement(By.xpath("//input[@id='number1']")).sendKeys("5");
        Thread.sleep(5000);

    }


}
