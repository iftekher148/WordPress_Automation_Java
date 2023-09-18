package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InstallPluginActiveTest {
    @Test
    public void InstallPluginActive() throws InterruptedException {
        //Open Chrome Browser
        WebDriver driver = new ChromeDriver();
//
        // Get site Link
        driver.get("https://iftekher.s3-tastewp.com/wp-login.php");

        //Provide username and password
        driver.findElement(By.id("user_login")).sendKeys("iftekher");
        driver.findElement(By.id("user_pass")).sendKeys("ELb3AyVRp8w ");
        driver.findElement(By.name("wp-submit")).click(); // Click on  submit/login button

        //get plugins links
        driver.get("https://iftekher.s3-tastewp.com/wp-admin/plugins.php");
        //click on 'Add New Plugins' button
        WebElement addNew = driver.findElement(By.xpath("//a[@class='page-title-action']"));
        addNew.click();

        // Search for 'WP Dark Mode' on search bar
        WebElement searchWpDark = driver.findElement(By.id("search-plugins"));
        searchWpDark.sendKeys("WP Dark Mode");

        // Locate and click the link to the specific plugin page from the search results
        WebElement pluginLink = driver.findElement(By.partialLinkText("https://iftekher.s3-tastewp.com/wp-admin/plugin-install.php?tab=plugin-information&plugin=wp-dark-mode&TB_iframe=true&width=357&height=612")); // Replace with the actual link text
        pluginLink.click();

        //Install the Wp Dark mood
        WebElement installDarkMood = driver.findElement(By.xpath("//a[@class='install-now button']"));
        installDarkMood.click();

        Thread.sleep(5000);
        //close browser
        driver.close();

    }
}
