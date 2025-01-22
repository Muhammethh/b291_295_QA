package com.myfirstSeleniumProject;

import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class day10_ReadExcel {


    @Test
    public void readExcel (){

//        Import the apache poi dependency in your pom file
//        Create resources directory under java folder(right click on java and create the folder)
//        Add the excel file on the resources folder Create a new package: excelautomation Create a new class : ReadExcel
//        Create a new test method : readExcel()
//        Store the path of the file in a string Open the file
//        Open the workbook using fileinputstream
//        Open the first worksheet
//        Go to first row
//        Go to first cell on that first row and print
//        Go to second cell on that first row and print
//        Go to 2nd row first cell and assert if the data equal to USA
//        Go to 3rd row 2nd cell-chain the row and cell
//        Find the number of row
//        Find the number of used row


        // exxcel dosyamin yolunu belirttim....
        String path = "resources/Capitals.xlsx";

        // 1-) Workbook > 2-) Sheet > 3-) Row > 4-) Cell .....

//   1.adim  workbook(excel) dosyasini acmak icin fileInputStream olarak ekle
        try {
            FileInputStream fileInputStream = new FileInputStream(path);


            //2.adim workbook(excel) acmam lazim kullanmam icin


            Workbook workbook = WorkbookFactory.create(fileInputStream);


            //3.adim sheet i acmak icin


            Sheet sheet1 = workbook.getSheet("Sheet1");

            Row  r1 = sheet1.getRow(0);

            //4. adim hucreye gidip degeri almak....

            Cell r1C1 = r1.getCell(0);

            System.out.println("Satir 1 ve hucre bir deki data(1A) = " + r1C1.toString());


            //        Go to second cell on that first row and print

          Cell r1C2 =  r1.getCell(1);

            System.out.println("1. satirin 2. hucresi ===> " + r1C2.toString());

            Assertions.assertEquals("CAPITAL",r1C2.toString());


//        Go to 2nd row first cell and assert if the data equal to USA

            System.out.println("==============================================");


          Row r2 =  sheet1.getRow(1);

        Cell r2c1 =  r2.getCell(0);

            System.out.println(r2c1);

            Assertions.assertEquals("USA",r2c1.toString());


//        Go to 3rd row 2nd cell-chain the row and cell

          Row r3 = sheet1.getRow(2);

         Cell r3c2 = r3.getCell(1);

            System.out.println(r3c2);





//        Find the number of used row
          int totalusedRows =  sheet1.getPhysicalNumberOfRows();

            System.out.println("totalUsedRows = " + totalusedRows);

//        Find the number of  row

        int totalRows =   sheet1.getLastRowNum()+1;

            System.out.println("totalRows = " + totalRows);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
