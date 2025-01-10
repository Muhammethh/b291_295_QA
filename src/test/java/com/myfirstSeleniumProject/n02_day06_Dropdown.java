package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class n02_day06_Dropdown extends TestBase {

//
    // ØGo to https://testcenter.techproeducation.com/index.php?page=dropdown
    //
    // 1.Create method selectByIndexTest and Select Option 1 using index
    // 2.Create method selectByValueTest Select Option 2 by value
    // 3.Create method selectByVisibleTextTest Select Option 1 value by visible text
    // 4.Create method printAllTest Print all dropdown value
    // 5.Verify the dropdown has Option 2 text
    // 6.Create method printFirstSelectedOptionTest Print first selected option
    // 7.Find the size of the dropdown, Print “Expected Is Not Equal Actual” if there are not 3 elements in the dropdown.


    @Test
    public void name() throws InterruptedException {

        //ØGo to https://testcenter.techproeducation.com/index.php?page=dropdown

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        //1.Create method selectByIndexTest and Select Option 1 using index

        //1.Adım dropdown için locator al

        WebElement simpleDropDown = driver.findElement(By.id("dropdown"));

        //2. Adım bir obje oluştur Select classında

        Select options = new Select(simpleDropDown);

        //3.Adım index numarasına göre elementi seç

        options.selectByIndex(1);
        Thread.sleep(3000);

        Assertions.assertTrue(simpleDropDown.getText().contains("1"));

        //2.Create method selectByValueTest Select Option 2 by value

        //Select classından objeyi oluşturduğum için o objeyi kullanabilirim

        options.selectByVisibleText("Option 2");
        Thread.sleep(3000);

        Assertions.assertTrue(simpleDropDown.getText().contains("Option 2"));


        // 3.Create method selectByVisibleTextTest Select Option 1 value by visible text

        options.selectByValue("2");
        Thread.sleep(3000);
        Assertions.assertTrue(simpleDropDown.getText().contains("1"));

        // 4.Create method printAllTest Print all dropdown value

        List<WebElement> allElements = options.getOptions();

        for (WebElement eachElement : allElements) {

            System.out.println(eachElement.getText());

        }


        // 5.Verify the dropdown has Option 2 text

        options.selectByValue("2");

        Assertions.assertTrue(simpleDropDown.getText().contains("2"));

        // 6.Create method printFirstSelectedOptionTest Print first selected option

        WebElement firstSelectedOption = options.getFirstSelectedOption();
        System.out.println("Seçilen son elementi göster" + firstSelectedOption.getText());

        Assertions.assertTrue(firstSelectedOption.getText().contains("2"));

        // 7.Find the size of the dropdown, Print “Expected Is Not Equal Actual” if there are not 3 elements in the dropdown.

        List<WebElement> allItems = options.getOptions();

        int numberOfElements = allItems.size();

        if (numberOfElements == 3) {

            System.out.println("Test Passed");

        } else {
            System.out.println("Expected Is Not Equal Actual");
        }


    }


    @Test
    public void dob() throws InterruptedException {

        //    Go to https://testcenter.techproeducation.com/index.php?page=dropdown


        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");


//    Create method selectByIndexTest and Select 2015 using index

        //1.Adım year için locator al
        WebElement year = driver.findElement(By.id("year"));


        //2.adım select classıyla obje oluştur ve year webelementini select objesinini içine at
        Select year2015 = new Select(year);

        //3.Adım index numarasını kullanarak 2015 yılını seç
        year2015.selectByIndex(10);

        Thread.sleep(3000);

//    Create method selectByValueTest Select January by value

        WebElement month = driver.findElement(By.id("month"));

        Select january = new Select(month);

        january.selectByValue("0");
        Thread.sleep(3000);

//    Create method selectByVisibleTextTest Select 15 value by visible text


        WebElement day = driver.findElement(By.id("day"));

        Select days = new Select(day);

        days.selectByVisibleText("15");
        Thread.sleep(3000);


    }


    @Test
    public void state() throws InterruptedException {

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        //state dropdown için locatorını belirle

        WebElement state = driver.findElement(By.id("state"));


        //select object oluşturmak

        Select states = new Select(state);

        states.selectByVisibleText("California");
        Thread.sleep(3000);

        List<WebElement> allStates = states.getOptions();

        for (WebElement eachState : allStates){

            System.out.println(eachState.getText());

        }

        System.out.println("Number of all states " + allStates.size());

    }


    // HOMEWORK

    // When user goes to https:// www.google.com/
    // Search for "porcelain teapot"
    // And print how many related results displayed on Google

    // HOMEWORK
    // Then create 3 different test methods using the following names. And Go to google.
    // titleTest =>Verify if google title = "Google"
    // imageTest => Verify if google image displays or not
    // gmailLinkTest => Verify if the Gmail link is displayed or not

    // Close the browser after each test

}
