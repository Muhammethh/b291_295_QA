package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class day13_FileDownloadTest extends TestBase {




    @Test
    void fileDownloadTest() {
        String path = System.getProperty("user.home") + "\\Downloads\\b10 all test cases, code.docx";
        /*
        Files.delete(Paths.get(path)); methodu paths olarak verilen dosyayı siler eğer belirtilen pathde dosya yoksa veya
        herhangi bir sebepten dolayı silinemez ise exception fırlatır
         */

        try {
            Files.delete(Paths.get(path));
        } catch (Exception e) {
            System.err.println("Dosya silinirken bir sorun oluştu");
        }

        //https://testcenter.techproeducation.com/index.php?page=file-download adresine gidelim.
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");

        //b10 all test cases dosyasını indirelim
        driver.findElement(By.partialLinkText("b10 all test cases, code.docx")).click();
        waitFor(3);

        //Dosyanın başarıyla indirilip indirilmediğini test edelim

        Assertions.assertTrue(Files.exists(Paths.get(path)));


    }



}
