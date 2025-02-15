package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class day15_WebElementScreenShot extends TestBase {

    /*
    Eğer sadece bir webelementin ekran görüntüsünü almak istersek o webelementin locateini alıp getScreenShotAs() methodu ile
    TakeScreenShot'a gerek kalmadan alabiliriz
     */

    @Test
    public void test01() throws IOException {

        //google sayfasına gidin
        driver.get("https://google.com");

        //searchboxın ekran görüntüsünü alın
        WebElement searchBox = driver.findElement(By.id("APjFqb"));

        searchBox.sendKeys("Batch 291");

        Files.createDirectories(Paths.get("screenshot"));

        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(LocalDateTime.now());
        Files.write(Paths.get("screenshot/we" + date+ ".png"),searchBox.getScreenshotAs(OutputType.BYTES));



    }

    @Test
    void test02() throws IOException {

        //Techproeducation sayfasına gidelim
        driver.get("https://www.techproeducation.com/");

        //Ana sayfanın başarıyla yüklendiğini doğrula.
        Assertions.assertEquals("https://www.techproeducation.com/", driver.getCurrentUrl());

        //Sayfanın ekran görüntüsünü alin
        takeScreenShots();


        //Sayfanın basinda görüntülenen telefon numarasinin +1 585 304 29 59 oldugunu dogrulayin
        WebElement telNumber = driver.findElement(By.xpath("(//a[.='+1 585 304 29 59'])[1]"));
        waitFor(1);
        Assertions.assertEquals("+1 585 304 29 59",telNumber.getText());



        //goruntulenen telefon numarasinin ekran goruntusunu alin
        Files.createDirectories(Paths.get("screenshot"));

        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(LocalDateTime.now());
        Files.write(Paths.get("screenshot/we" + date+ ".png"),telNumber.getScreenshotAs(OutputType.BYTES));

    }

}
