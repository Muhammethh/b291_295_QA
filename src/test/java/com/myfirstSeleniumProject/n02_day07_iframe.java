package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class n02_day07_iframe extends TestBase {


    //    Go to
//    https://testpages.herokuapp.com/styled/frames/frames-test.html
//
//    Then Assert that "Left List Item 29" is the last element in the "Left"
//    And Assert that "Middle List Item 39" is the last element in the "Middle"


    @Test
    public void iFrame() {

        driver.get("https://testpages.herokuapp.com/styled/frames/frames-test.html");


        //1Adım left tablosuna gitmem lazım ama iframe var bu yüzden switchto yapmamız lazım

        driver.switchTo().frame(1);

        WebElement leftlist29 = driver.findElement(By.xpath("//li[@id='left29']"));

        System.out.println(leftlist29.getText());

        List<WebElement> leftAll = driver.findElements(By.xpath("//li"));

        WebElement lastElement = leftAll.get(leftAll.size() - 1);

        System.out.println(lastElement.getText());

        Assertions.assertTrue(lastElement.getText().contains("29"));

        //    And Assert that "Middle List Item 39" is the last element in the "Middle"

        driver.switchTo().defaultContent();

        driver.switchTo().frame("middle");

        List<WebElement> middleAll = driver.findElements(By.xpath("//li"));

        String middle39 = middleAll.get(middleAll.size() - 1).getText();

        Assertions.assertTrue(middle39.contains("39"));

    }


}
