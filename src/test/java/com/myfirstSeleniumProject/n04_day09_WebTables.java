package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class n04_day09_WebTables extends TestBase {


    //https://the-internet.herokuapp.com/tables
    //
    //Create a class: WebTables
    //Task 1 : Print the entire table and Assert if the last element in the table 1 is "edit delete"
    //
    //Task 2 : Print All Rows
    //Task 3 : Print Last row data only
    //Task 4 : Print column 5 data in the table body
    //
    //HW
    //Task 5 :  Print the information of columns 1 and 2 in 3 rows
    //Task 6 : Write a method that accepts 2 parameters
    //Parameter 1 = row number
    //Parameter 2 = column number
    //printData(2,3);  => prints data in 2nd row 3rd column


    @Test
    public void webTables() {

        driver.get("https://the-internet.herokuapp.com/tables");

        Assertions.assertTrue(driver.getCurrentUrl().contains("tables"));

        //Task 1 : Print the entire table and Assert if the last element in the table 1 is "edit delete"

        WebElement entireTable1 = driver.findElement(By.id("table1"));

        System.out.println(entireTable1.getText());

        //eger ben table1 deki son elementin edit delete oldugunu verify etmek istersem nasil yaparim

//        WebElement lastElement = driver.findElement(By.xpath("(//tbody//tr[4]//td[6])[1]"));
        WebElement lastElement = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[4]//td[6]"));
        System.out.println(lastElement.getText());
        Assertions.assertTrue(lastElement.getText().contains("edit"));

        //Task 2 : Print All Rows

        System.out.println("=================================================");


        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));

        int rowNum = 1;
        for (WebElement each : allRows) {


            System.out.println("Row Number  " + rowNum + " = " + each.getText());
            rowNum++;

        }


        //Task 3 : Print Last row data only

        String lastRow = allRows.get(allRows.size() - 1).getText();
        System.out.println("En son satiri yazdircak ====>>>  " + lastRow);




        //Task 4 : Print column 5 data in the table body
        System.out.println("=========================================================");
        List<WebElement> sutun5TumElement = driver.findElements(By.xpath("//table[@id='table1']//tr//td[5]"));

        int row = 1;
        for (WebElement eachData : sutun5TumElement) {

            System.out.println("Row number " + row + " =" + eachData.getText());
            row++;

        }



        //HW
        //Task 5 :  Print the information of columns 1 and 2 in 3 rows
        //Task 6 : Write a method that accepts 2 parameters
        //Parameter 1 = row number
        //Parameter 2 = column number
        //printData(2,3);	=> prints data in 2nd row 3rd column


    }


}
