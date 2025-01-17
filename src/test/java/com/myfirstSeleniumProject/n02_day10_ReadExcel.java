package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class n02_day10_ReadExcel extends TestBase {


    @Test
    public void readExcel() {

        //excel dosyasının yolunu belirttik
        String path = "resources/Capitals.xlsx";

        //workbook(excel) dosyasını açmak için fileinputstream olarak ekle
        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            //2.adım workbooku(excel)i açmam lazım

            Workbook workbook = WorkbookFactory.create(fileInputStream);

            //3.Adım sheeti açmak için

            Sheet sheet1 = workbook.getSheet("Sheet1");

            Row r1 = sheet1.getRow(0);

            //4.ADIM hücreye gidip değeri almak

            Cell r1C1 = r1.getCell(0);

            System.out.println("Satır 1 ve Hücre 1 de ki data (1A) = " + r1C1);




        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
