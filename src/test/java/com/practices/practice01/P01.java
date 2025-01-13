package com.practices.practice01;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class P01 extends TestBase {
    /*
TEST SENARYOLARI
      //  https://www.youtube.com adresine gidin
      // TEST1=> Sayfa başlığının "YouTube" oldugunu test edin
      // TEST2=> YouTube logosunun görüntülendiğini (isDisplayed()) test edin
      // TEST3=> Search Box 'in erisilebilir oldugunu test edin (isEnabled())
      // TEST4=> wrongTitleTest  => Sayfa basliginin "test" icermedigini dogrulayin
*/

    //tavsiye edilmez
    @Test
    void test01() throws InterruptedException {
        //  https://www.youtube.com adresine gidin
        // TEST1=> Sayfa başlığının "YouTube" oldugunu test edin
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");
        Thread.sleep(3000);
        assertEquals("YouTube", driver.getTitle());

        // TEST2=> YouTube logosunun görüntülendiğini (isDisplayed()) test edin
        WebElement youtubeLogo = driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        Assertions.assertTrue(youtubeLogo.isDisplayed());

        // TEST3=> Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        WebElement searchBox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        Assertions.assertTrue(searchBox.isEnabled());

        // TEST4=> wrongTitleTest  => Sayfa basliginin "test" icermedigini dogrulayin
        Assertions.assertFalse(driver.getTitle().contains("test"));

        driver.quit();
    }




    @Test
    void titleTest() throws InterruptedException {
        driver.get("https://www.youtube.com");

        assertEquals("ouTube", driver.getTitle(),"safya basligi uyumlu degil");
    }

    @Test
    void logoTest() throws InterruptedException {
        // TEST2=> YouTube logosunun görüntülendiğini (isDisplayed()) test edin
        driver.get("https://www.youtube.com");
        WebElement youtubeLogo = driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        assertTrue(youtubeLogo.isDisplayed(),"logo goruntulenmedi");
    }

    @Test
    void searchBoxTest() throws InterruptedException {
        // TEST3=> Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        driver.get("https://www.youtube.com");
        WebElement searchBox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        assertTrue(searchBox.isEnabled(),"searchbox erisilebilir degil");
    }

    @Test
    void negativeTitleTest() throws InterruptedException {
        // TEST4=> wrongTitleTest  => Sayfa basliginin "test" icermedigini dogrulayin
        driver.get("https://www.youtube.com");
        assertFalse(driver.getTitle().contains("test"),"sayfa basligi test iceriyor");
    }


}