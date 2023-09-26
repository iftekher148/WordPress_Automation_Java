//Class-02
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicGoogleLocator extends DriverSetup{

    @Test
    public void testLocator() throws InterruptedException {

        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("Try Locate web ");

        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        //gmailLink.click();
        System.out.println(gmailLink.getText());

        WebElement imageLink = driver.findElement(By.partialLinkText("mages"));
        imageLink.click();

        Thread.sleep(2000);
    }
}
