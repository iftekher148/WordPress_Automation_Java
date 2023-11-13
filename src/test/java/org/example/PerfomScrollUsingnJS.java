package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PerfomScrollUsingnJS extends DriverSetup{
    @Test
    public void testUsingJS() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
        Thread.sleep(3000);
        //Scroll Using exact point
        WebElement mouseHoverButton = driver.findElement(By.xpath("//button[@id='mousehover']"));
        js.executeScript("arguments[0].scrollIntoView();", mouseHoverButton);
        Thread.sleep(3000);
    }
}
