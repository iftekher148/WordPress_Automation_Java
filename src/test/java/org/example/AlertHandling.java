package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertHandling extends DriverSetup {
    @Test
    public void testAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //Click For js Alert
        WebElement jsAlert= driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        jsAlert.click();
        Thread.sleep(2000);
        // Create Alert class for Alert Handling.
        //It's come from selenium
        Alert alert = driver.switchTo().alert(); // Switch to current opening alert window
        Assert.assertEquals(alert.getText(),"I am a JS Alert"); // Test case
        alert.accept(); // Click "OK". accept it
        Thread.sleep(5000);
        String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You successfully clicked an alert"); // Test case for result
        System.out.println("Result: " + result);


        // Working With Second Alert function
        //This is for "Cancel"
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        alert = driver.switchTo().alert(); // Switch to current alert
        Thread.sleep(2000);
        alert.dismiss(); // Click on Cancel Button
        Thread.sleep(2000);
        result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You clicked: Cancel");
        Thread.sleep(2000);

        // Working for "OK"
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        alert = driver.switchTo().alert(); // Switch to current alert
        Thread.sleep(2000);
        alert.accept(); // Click on Cancel Button
        Thread.sleep(2000);
        String result2 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result2,"You clicked: Ok");
        Thread.sleep(2000);


        //Working With Third Alert function
        // Enter some text and OK
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.sendKeys("Hello World");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You entered: Hello World");
        Thread.sleep(2000);

        // For Cancel
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.dismiss();
        Thread.sleep(2000);
        result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You entered: null");
        Thread.sleep(2000);

    }
}
