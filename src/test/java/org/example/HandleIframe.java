package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleIframe extends DriverSetup{
    @Test
    public void testIframe() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement mouseHoverButton = driver.findElement(By.xpath("//button[@id='mousehover']"));
        js.executeScript("arguments[0].scrollIntoView();", mouseHoverButton);
        Thread.sleep(3000);

//        driver.switchTo().frame("courses-iframe");
//        driver.switchTo().frame(0);
//        driver.switchTo().frame("iframe-name");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
        WebElement course_button = driver.findElement(By.linkText("Courses"));
        System.out.println(course_button.getText());
        Thread.sleep(3000);
        //back from Iframe content
        driver.switchTo().defaultContent();

        WebElement iframeExample = driver.findElement(By.xpath("//button[@id='mousehover']"));
        System.out.println(iframeExample.getText());

    }
}
