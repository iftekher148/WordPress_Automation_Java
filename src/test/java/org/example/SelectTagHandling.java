package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectTagHandling extends DriverSetup{
    @Test
    public void testTagHandling() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        dropDown.click();
        // Create select class for select
        Select select = new Select(dropDown);
        select.selectByVisibleText("Option3");
        Thread.sleep(2000);

        select.selectByValue("option2");
        Thread.sleep(2000);

        select.selectByIndex(1);
        Thread.sleep(2000);

        System.out.println( select.getFirstSelectedOption().getText()); // Which one select
    }
}
