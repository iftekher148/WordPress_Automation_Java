package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage extends DriverSetup{
    @Test
    public void TestLoginPage() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");

        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Enter Email Address
        WebElement emailValue = driver.findElement(By.xpath("//input[@class='email']"));
        emailValue.sendKeys("abc123@gmail.com");

        //Enter Password
        WebElement passwordValue = driver.findElement(By.id("Password"));
        passwordValue.sendKeys("123abc");

        //Remember Me Check Box
        WebElement rememberMeBox = driver.findElement(By.id("RememberMe"));
        rememberMeBox.click();
        Thread.sleep(5000);

        //Login Button
        WebElement login_btn = driver.findElement(By.xpath("//button[@type='submit']"));
        login_btn.click();
    }
}
