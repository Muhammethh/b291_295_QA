package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class n01_day12_Actions03 extends TestBase {


    @Test
    public void dragandDrop() {

//        Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

        switchIframeByIdOrName("mce_0_ifr");

//        And user moves the target element(Drag me to my target) in to
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));

        WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));

//        destination(Drop here)

        //Action classından objeyi oluştur, driverı initiate etmek için

        Actions actions = new Actions(driver);

        actions.dragAndDrop(source,target).perform();



    }


    @Test
    public void reasuableDragAndDrop(){


//        Given user is on https://jqueryui.com/droppable/

        driver.get("https://jqueryui.com/droppable/");


        //iframe eklendi
        switchIframeByIndex(0);


        //        And user moves the target element(Drag me to my target) in to
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));

        WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));

        //reusable methodunu kullan...

        actionsDragAndDrop(source,target);


    }

    /*HOMEWORK...

    Given user is on the
    https://testcenter.techproeducation.com/index.php?page=context-menu
    When user Right clicks on the box
    Then verify the alert message is "You selected a context menu"
    Then accept the alert*/




}
