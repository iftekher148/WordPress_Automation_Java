package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class GetNavigate extends DriverSetup {
    @Test
    public void testNavigate() throws InterruptedException {

        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.navigate().back(); //
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.TAB); // Create a new tab
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.WINDOW); //Create new window
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(3000);



    }
    @Test
    public void testWindow() throws InterruptedException {
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//button[@id='openwindow']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='opentab']")).click();
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());  // Find current working URL
        System.out.println(driver.getWindowHandle()); //find current identification number

        List <String> windowList = new ArrayList<>(driver.getWindowHandles()); //Get list of number tab identification
        System.out.println(windowList.get(1));
        System.out.println(windowList.get(2));

        driver.switchTo().window(windowList.get(2)); // varify switch to tab 2
        System.out.println(driver.getCurrentUrl()); // find tab 2 url
        Thread.sleep(3000);

        driver.switchTo().window(windowList.get(1)); // varify switch to tab 1
        System.out.println(driver.getCurrentUrl()); // find tab 1 url
        Thread.sleep(3000);

        driver.switchTo().window(windowList.get(0)); // varify switch to tab 0
        System.out.println(driver.getCurrentUrl()); // find tab 0 url
        Thread.sleep(3000);


        Thread.sleep(3000);
    }
}
