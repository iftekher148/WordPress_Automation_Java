package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DifferentWait extends DriverSetup{
    @Test
    public void testWait(){
        driver.get("https://qavbox.github.io/demo/alerts/");
        driver.findElement(By.xpath("//input[@id='delayalert']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.alertIsPresent()); //!st Method
        Alert alert = wait.until(ExpectedConditions.alertIsPresent()); //Second Method

        //driver.switchTo().alert().accept(); //!st
        alert.accept(); //Second Method
    }
}
