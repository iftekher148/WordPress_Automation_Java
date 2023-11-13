package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstWebTestCase {
    @Test
    public void LoadGooglePage() throws InterruptedException {
        // Open browser
        WebDriver driver = new ChromeDriver();

        // browser google homepage https://www.google.com/
        driver.get("https://www.google.com");

        //Observe home page
        Thread.sleep(5000);

        //close browser
        driver.close();
    }
}
