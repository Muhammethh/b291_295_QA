package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class day16_ExtentReport extends TestBase {


    @Test
    void template() {

        createExtentReport("template");

        //Testin basarili oldugu bilgisini rapora ekler
        extentTest.pass("Pass");

        //Test ile alakali bilgi notunu rapora ekler
        extentTest.info("Bilgilendirme notu");

        //Testin basarisiz oldugu bilgisini rapora ekler
        extentTest.fail("Fail Mesaji");

        //Test ile alakai uyari mesajini rapora ekler
        extentTest.warning("Uyari mesaji");

        //NOT=> Tüm test verilerini kaydeder ve html raporu tamamlar, bir rapor olusturulabilmesi icin
        // bu methodu kullanmak sarttir.
        extentReports.flush();

    }


    @Test
    void extentReportTest() {

        createExtentReport("Social Media icons test");


        //TechproEducation sayfasina gidelim
        extentTest.info("Kullanıcı techproeducation sayfasına gider");
        driver.get("https://techproeducation.com");
        addScreenShotToReport();

        //TechproEducation ana sayfada oldugunuzu dogrulayin
        extentTest.info("TechproEducation ana sayfada oldugunu doğrular");
        extentTest.pass("Ana sayfa URL testi başarılı");
        Assertions.assertEquals("https://www.techproeducation.com/", driver.getCurrentUrl());


        //Ana Sayfada sosyal medya iconlarinin goruntulendigini dogrulayin
        extentTest.info("Ana sayfada sosyal medya iconlarının görüntülendiini doğrular");
        extentTest.pass("Social Media icon testi başarılı");
        WebElement icons = driver.findElement(By.className("toolbar-sl-share"));

        addScreenShotOfWebelementToReport(icons);

        Assertions.assertTrue(icons.isDisplayed());

        extentReports.flush();


    }

    /*
    Homework
     extent report ile raporlamasini yapalim
     //Amazon sayfasına gidelim
     //Arama kutusunda selenium aratalim
     //Sayfa basliginin selenium icerdigini doğrulayalim
     */





}
