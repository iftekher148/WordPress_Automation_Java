package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PerformActionsHover extends DriverSetup {

    @Test
    public void testActionsHover() throws InterruptedException {
        driver.get("https://demoqa.com/menu#");
        WebElement mainItem2 = driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
        // Create Actions class object for Hover
        Actions actions = new Actions(driver);
        actions.clickAndHold(mainItem2).build().perform(); // this method use for click and hold
       // actions.build().perform();  // 1St will build then perform
        Thread.sleep(2000);

        // click on Sub list
        driver.findElement(By.xpath("(//a[@href='#'][normalize-space()='Sub Item'])[2]")).click();
        Thread.sleep(2000);

        //Sub sub list Hover
        actions.clickAndHold(driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']"))).build().perform();
        Thread.sleep(2000);

        //sub sub list item click
        driver.findElement(By.xpath("//a[normalize-space()='Sub Sub Item 2']")).click();
        Thread.sleep(2000);

    }

    @Test
    public void MultiSelector() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        // Create Actions class object for Hover
        Actions actions = new Actions(driver);

        Select select = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
        actions.keyDown(Keys.CONTROL).click(select.getOptions().get(1)).click(select.getOptions().get(2)).keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(2000);
    }

    @Test
    public void testCopyPaste() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // .........Copy & Paste Using Actions Class.....
        //Create a Actions Class
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hello");
        //Mark or Select Using Actions Class
        //actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        Thread.sleep(1000);

        //Copy Using Actions Class
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        Thread.sleep(1000);

        //Paste Using Actions Class
        driver.findElement(By.xpath("//input[@id='name']")).click();
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.perform();
        Thread.sleep(1000);


//        //........Select and Copy Using sendKeys.....
//        WebElement sourceElement  = driver.findElement(By.xpath("//input[@id='autocomplete']"));
//        sourceElement.sendKeys("Hello World");
//        sourceElement.sendKeys(Keys.CONTROL,"a","c");
//        Thread.sleep(3000);
//
//        //Paste Not using Actions class......
//        WebElement targetElement  = driver.findElement(By.xpath("//input[@id='name']"));
//        targetElement .sendKeys(Keys.CONTROL,"v");
//        Thread.sleep(3000);


        //Scroll Using Actions Class
       // actions.scrollByAmount(0,1200).build().perform();
        actions.scrollToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
        Thread.sleep(3000);


    }
}
