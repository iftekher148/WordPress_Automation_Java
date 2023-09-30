package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.URL;

public class InteractingWebElement extends DriverSetup {
    @Test
    public void testWebElement() throws InterruptedException {

        //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        //Find tagName
        WebElement textBox = driver.findElement(By.cssSelector("#autocomplete"));
        String tagName = textBox.getTagName();
        String attributeName= textBox.getAttribute("placeholder");
        System.out.println(tagName);
        System.out.println(attributeName);


        textBox.sendKeys("Hello World");
        Thread.sleep(2000);
        textBox.clear();
        Thread.sleep(2000);

        System.out.println(textBox.isDisplayed());


        WebElement checkOption = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
        System.out.println(checkOption.isSelected());
        checkOption.click();
        Thread.sleep(2000);
        System.out.println(checkOption.isSelected());
        System.out.println(checkOption.isEnabled());


        WebElement elementDisplay = driver.findElement(By.cssSelector("#displayed-text"));
        elementDisplay.sendKeys("Before Send Text");
        Thread.sleep(2000);
        WebElement hideOption = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
        hideOption.click();
        Thread.sleep(2000);
        WebElement showOption = driver.findElement(By.xpath("//input[@id='show-textbox']"));
        showOption.click();
        Thread.sleep(2000);




    }
}
