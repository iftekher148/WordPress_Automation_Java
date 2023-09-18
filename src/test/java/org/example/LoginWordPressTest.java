package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginWordPressTest {
    @Test
    public void LoginWordpress() throws InterruptedException {
        // Open browser
        WebDriver driver = new ChromeDriver();

        // browser google homepage https://iftekher.s3-tastewp.com/wp-login.php
        driver.get("https://iftekher.s3-tastewp.com/wp-login.php");

        driver.findElement(By.id("user_login")).sendKeys("iftekher");
        driver.findElement(By.id("user_pass")).sendKeys("ELb3AyVRp8w ");
        driver.findElement(By.name("wp-submit")).click();

        Thread.sleep(5000);

        //close browser
        driver.close();



    }
}
