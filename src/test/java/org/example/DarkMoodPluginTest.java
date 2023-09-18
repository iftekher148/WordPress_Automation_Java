package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DarkMoodPluginTest {
    @Test
    public void DarkMoodPlugin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // browser google homepage https://iftekher.s3-tastewp.com/wp-login.php
        driver.get("https://iftekher.s3-tastewp.com/wp-login.php");

        driver.findElement(By.id("user_login")).sendKeys("iftekher");
        driver.findElement(By.id("user_pass")).sendKeys("ELb3AyVRp8w ");
        driver.findElement(By.name("wp-submit")).click();

        //plugins path
        driver.get("https://iftekher.s3-tastewp.com/wp-admin/plugins.php");

        // Check if the "WP Dark Mode" plugin is active
        WebElement activeDarkMood =driver.findElement(By.xpath("//a[@id='deactivate-backup-backup']"));

        if (activeDarkMood.getText().contains("Deactivate")) {
            System.out.println("The Dark Mood plugin is not active.");
            } else {
            System.out.println("The Dark Mood plugin is active.");
             }

        Thread.sleep(5000);
        //close browser
        driver.close();
    }
}
