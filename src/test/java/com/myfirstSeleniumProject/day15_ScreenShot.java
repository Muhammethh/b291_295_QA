package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class day15_ScreenShot extends TestBase {


     /*
    1-Almak istedigimiz ekran görüntüsünü kaydetmek istedigimiz yolu belirleriz
    2-TakeScreenShot tipinde object declare edip driver i bu objecte assign ederiz
    3-Files classindan write() methodunu kullanarak icine parametre olarak aldigimiz ekran görüntüsün nereye kaydedeceğimizi belirtiriz
     */

    @Test
    public void test01() throws IOException {
        //techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //sayfanın ekran görüntüsünü alalım
        //Ekran görüntüsünün saklanacağı screenshots isimli bir klasör oluşturur
        //Eğer klasör zaten var ise işlem yapılmaz
        Files.createDirectories(Paths.get("screenshots"));

        TakesScreenshot ts = (TakesScreenshot) driver;

        Files.write(Paths.get("screenshots/techpro.png") ,ts.getScreenshotAs(OutputType.BYTES));


    }

    @Test
    public void test02() throws IOException {

        driver.get("https://google.com");

        Files.createDirectories(Paths.get("screenshots"));

        TakesScreenshot ts = (TakesScreenshot) driver;

        Files.write(Paths.get("screenshots/google.png") ,ts.getScreenshotAs(OutputType.BYTES));

    }


    @Test
    public void test03() throws IOException {

        driver.get("https://google.com");

        Files.createDirectories(Paths.get("screenshots"));

        TakesScreenshot ts = (TakesScreenshot) driver;
        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(LocalDateTime.now());

        Files.write(Paths.get("screenshots/google" + date + ".jpeg") ,ts.getScreenshotAs(OutputType.BYTES));
    }



    @Test
    public void reusableMethodUsage() {

        driver.get("https://google.com");

        takeScreenShots();
    }




}
